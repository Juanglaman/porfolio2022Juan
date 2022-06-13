import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Proyectos } from 'src/app/models/proyectos';
import { ProyectosService } from 'src/app/servicios/proyectos.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from 'src/app/servicios/login.service';
import { GuardarImagenService } from 'src/app/servicios/guardar-imagen.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})

export class ProyectosComponent implements OnInit {

  public archivoCapturado : Array<File>= [];
  public proList: Proyectos[]=[];
  public  uLoged: string | undefined;

  /*FORMULARIOS*/
  signupFormProyectos: FormGroup;
  editarFormProyectos: FormGroup;

  constructor( private proService: ProyectosService, private _builder: FormBuilder,
               private loginService: LoginService, private guardarImg: GuardarImagenService) {
    this.signupFormProyectos = this._builder.group({
      nombre_pro: ['', Validators.required],
      fecha_inicio_pro: ['', Validators.required],
      fecha_fin_pro: ['', Validators.required],
      descripcion_pro: ['', Validators.required],
      link_pro: ['', Validators.required],
      url_imagen_pro: ['', Validators.required]
    })

    this.editarFormProyectos = this._builder.group({
      id_pro: ['', Validators.nullValidator],
      nombre_pro: ['', Validators.required],
      fecha_inicio_pro: ['', Validators.required],
      fecha_fin_pro: ['', Validators.required],
      descripcion_pro: ['', Validators.required],
      link_pro: ['', Validators.required],
      url_imagen_pro: ['', Validators.required]
    })
  }

  ngOnInit(): void {
    this.uLoged = this.loginService.getToken();

    this.getPProyectos();

    this.loginService.uLoged$.subscribe( texto =>{
      this.uLoged= texto;
    })
  }

  public getPProyectos():void{
    this.proService.getProyectos().subscribe({
      next: (Response: Proyectos[]) =>{
        this.proList=Response;
      },
      error: (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public enviarProyecto(): void{
    //Guardado de imagen
    let formuData = new FormData();
    for (let i = 0; i < this.archivoCapturado.length; i++) {
      formuData.append("file", this.archivoCapturado[i], this.archivoCapturado[i].name)
    }
    this.guardarImg.addImagen(formuData);
    this.signupFormProyectos.value.url_imagen_pro = this.archivoCapturado[0].name;

    this.proService.addProyectos(this.signupFormProyectos.value).subscribe({
      next: (Response: Proyectos) =>{
        console.log(Response);
        this.getPProyectos();
        alert("Proyecto agregado correctamente");
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  capturarFile(event: any){
    console.log(event);
    this.archivoCapturado = event.target.files;
    console.log(this.archivoCapturado);
  }


  public editarProyecto(id_pro: number): void{

    //Guardado de imagen
    let formuData = new FormData();
    for (let i = 0; i < this.archivoCapturado.length; i++) {
      formuData.append("file", this.archivoCapturado[i], this.archivoCapturado[i].name)
    }
    this.guardarImg.addImagen(formuData);

    //Editar datos por id
    this.editarFormProyectos.value.id_pro = id_pro;
    this.editarFormProyectos.value.url_imagen_pro = this.archivoCapturado[0].name;
    console.log(this.editarFormProyectos.value);
    this.proService.updateProyectos(this.editarFormProyectos.value).subscribe({
      next: (Response: Proyectos) =>{
        console.log(Response);
        alert("Proyecto editado correctamente");
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public deleteProyectoBoton(id_pro: number):void{
    this.proService.deleteProyectos(id_pro).subscribe({
      next: (Response: void) =>{
        console.log(Response);
        alert("Proyecto eliminado correctamente");
        this.getPProyectos();
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
        console.log(id_pro);
      }
    })

  }

}
