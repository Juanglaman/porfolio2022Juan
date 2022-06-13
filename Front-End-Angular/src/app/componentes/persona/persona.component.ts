import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/models/persona';
import { PersonaService } from 'src/app/servicios/persona.service';
import { HttpErrorResponse } from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from 'src/app/servicios/login.service';
import { GuardarImagenService } from 'src/app/servicios/guardar-imagen.service';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {

  public archivoCapturadoPerfil : Array<File>= [];
  public archivoCapturadoBaner : Array<File>= [];
  public persona: Persona | undefined;
  public  uLoged: string | undefined;

  editarPersonaForm: FormGroup;

  constructor( private personaService: PersonaService, private _builder: FormBuilder, private loginService: LoginService, private guardarImagen : GuardarImagenService) {
    this.editarPersonaForm = this._builder.group({
      nombre: ['', Validators.required],
      apellido: ['', Validators.required],
      fecha_nacimiento: ['', Validators.required],
      correo: ['', Validators.required],
      sobre_mi: ['', Validators.required],
      url_foto_perfil: ['', Validators.required],
      url_foto_baner: ['', Validators.required]
    })
  }

  ngOnInit(): void {
    this.uLoged = this.loginService.getToken();

    this.getPersona();

    this.loginService.uLoged$.subscribe( texto =>{
      this.uLoged= texto;
    })
  }

  capturarFilePerfil(eventP: any){
    console.log(eventP);
    this.archivoCapturadoPerfil = eventP.target.files;
    console.log(this.archivoCapturadoPerfil);
  }

  capturarFileBaner(eventB: any){
    console.log(eventB);
    this.archivoCapturadoBaner = eventB.target.files;
    console.log(this.archivoCapturadoBaner);
  }

  public getPersona(): void{
    this.personaService.getPersona().subscribe({
        next: (response: Persona) =>{
            this.persona = response;
            this.getPersona();
        },
        error:(error: HttpErrorResponse)=>{
          alert(error.message);
        }
    })
  }

  public editarPersona(): void{
    this.editarPersonaForm.value.id_per="1";

    //Guardado de imagen
    let formuData = new FormData();
    for (let i = 0; i < this.archivoCapturadoPerfil.length; i++) {
      formuData.append("file", this.archivoCapturadoPerfil[i], this.archivoCapturadoPerfil[i].name)
    }
    this.guardarImagen.addImagen(formuData);
    this.editarPersonaForm.value.url_foto_perfil = this.archivoCapturadoPerfil[0].name;

    //Guardado de imagen
    let formData = new FormData();
    for (let i = 0; i < this.archivoCapturadoBaner.length; i++) {
      formData.append("file", this.archivoCapturadoBaner[i], this.archivoCapturadoBaner[i].name)
    }
    this.guardarImagen.addImagen(formData);
    this.editarPersonaForm.value.url_foto_baner = this.archivoCapturadoBaner[0].name;
    console.log(this.editarPersonaForm.value);
    this.personaService.actualizarPersona(this.editarPersonaForm.value).subscribe({
      next: (Response: Persona) =>{
        console.log(Response);
        alert("Persona editada correctamente");
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
        this.getPersona();
      }
    })
  }

}
