import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Explaboral } from 'src/app/models/explaboral';
import { ExplaboralService } from 'src/app/servicios/explaboral.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from 'src/app/servicios/login.service';
import { GuardarImagenService } from 'src/app/servicios/guardar-imagen.service';

@Component({
  selector: 'app-laboral',
  templateUrl: './laboral.component.html',
  styleUrls: ['./laboral.component.css']
})

export class LaboralComponent implements OnInit {

  public expLaboList: Explaboral[]=[];
  public archivoCapturado : Array<File>= [];
  public  uLoged: string | undefined;

  modalForm: FormGroup;
  laboForm: FormGroup;

  constructor( private explaboServices: ExplaboralService, private _builder: FormBuilder, private loginService: LoginService, private guardarImagen: GuardarImagenService) {
    this.modalForm = this._builder.group({
      nombre_empresa: ['', Validators.required],
      fecha_inicio: ['', Validators.required],
      fecha_fin: ['', Validators.required],
      descripcion: ['', Validators.required],
      puesto: ['', Validators.required],
      url_logo_empresa: ['', Validators.required]
    })

    this.laboForm = this._builder.group({
      id_exp: ['', Validators.nullValidator],
      nombre_empresa: ['', Validators.required],
      fecha_inicio: ['', Validators.required],
      fecha_fin: ['', Validators.required],
      descripcion: ['', Validators.required],
      puesto: ['', Validators.required],
      url_logo_empresa: ['', Validators.required]
    })
  }

  ngOnInit(): void {

    this.uLoged = this.loginService.getToken();

    this.getPExpLaboral();

    this.loginService.uLoged$.subscribe( texto =>{
        this.uLoged= texto;
      })
  }

  public getPExpLaboral():void{
    this.explaboServices.getExplaboral().subscribe({
      next: (Response: Explaboral[]) =>{
        this.expLaboList=Response;
      },
      error: (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  capturarFile(event: any){
    console.log(event);
    this.archivoCapturado = event.target.files;
    console.log(this.archivoCapturado);
  }

  public enviarExpLaboral(): void{
      //Guardado de imagen
    let formuData = new FormData();
    for (let i = 0; i < this.archivoCapturado.length; i++) {
      formuData.append("file", this.archivoCapturado[i], this.archivoCapturado[i].name)
    }
    this.guardarImagen.addImagen(formuData);
    this.modalForm.value.url_logo_empresa = this.archivoCapturado[0].name;

      this.explaboServices.crearExplaboral(this.modalForm.value).subscribe({
      next: (Response: Explaboral) =>{
        console.log(Response);
        this.getPExpLaboral();
        alert("Experiencia laboral agregada correctamente");
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public editarExpLaboral(id_exp: number): void{
    //Guardado de imagen
    let formuData = new FormData();
    for (let i = 0; i < this.archivoCapturado.length; i++) {
      formuData.append("file", this.archivoCapturado[i], this.archivoCapturado[i].name)
    }
    this.guardarImagen.addImagen(formuData);

    this.laboForm.value.id_exp=id_exp;
    this.laboForm.value.url_logo_empresa = this.archivoCapturado[0].name;
    this.explaboServices.actualizarExplaboral(this.laboForm.value).subscribe({
      next: (Response: Explaboral) =>{
        console.log(Response);
        alert("Experiencia editada correctamente");
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public deleteExpLaboral(id_exp: number):void{
    this.explaboServices.borrarExplaboral(id_exp).subscribe({
      next: (Response: void) =>{
        console.log(Response);
        alert("Experiencia laboral eliminada correctamente");
        this.getPExpLaboral();
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
        console.log(id_exp);
      }
    })

  }
}
