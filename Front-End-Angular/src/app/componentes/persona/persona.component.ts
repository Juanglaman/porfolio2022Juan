import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/models/persona';
import { PersonaService } from 'src/app/servicios/persona.service';
import { HttpErrorResponse } from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from 'src/app/servicios/login.service';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {
  public persona: Persona | undefined;
  public  uLoged: string | undefined;

  editarPersonaForm: FormGroup;

  constructor( private personaService: PersonaService, private _builder: FormBuilder, private loginService: LoginService) {
    this.editarPersonaForm = this._builder.group({
      nombre: ['', Validators.required],
      apellido: ['', Validators.required],
      domicilio: ['', Validators.required],
      fecha_nacimiento: ['', Validators.required],
      telefono: ['', Validators.required],
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
    //this.editarPersonaForm.value.id_per=id_per;
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
