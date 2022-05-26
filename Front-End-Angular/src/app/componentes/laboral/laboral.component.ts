import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Explaboral } from 'src/app/models/explaboral';
import { ExplaboralService } from 'src/app/servicios/explaboral.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from 'src/app/servicios/login.service';

@Component({
  selector: 'app-laboral',
  templateUrl: './laboral.component.html',
  styleUrls: ['./laboral.component.css']
})
export class LaboralComponent implements OnInit {

  public expLaboList: Explaboral[]=[];

  public  uLoged: string | undefined;

  modalForm: FormGroup;
  laboForm: FormGroup;

  constructor( private explaboServices: ExplaboralService, private _builder: FormBuilder, private loginService: LoginService) {
    this.modalForm = this._builder.group({
      nombre_empresa: ['', Validators.required],
      fecha_inicio: ['', Validators.required],
      fecha_fin: ['', Validators.required],
      descripcion: ['', Validators.required],
      puesto: ['', Validators.required]
    })

    this.laboForm = this._builder.group({
      id_exp: ['', Validators.nullValidator],
      nombre_empresa: ['', Validators.required],
      fecha_inicio: ['', Validators.required],
      fecha_fin: ['', Validators.required],
      descripcion: ['', Validators.required],
      puesto: ['', Validators.required]
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

  public enviarExpLaboral(): void{

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
    this.laboForm.value.id_exp=id_exp;
    console.log(id_exp);
    console.log(this.laboForm.value);

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
