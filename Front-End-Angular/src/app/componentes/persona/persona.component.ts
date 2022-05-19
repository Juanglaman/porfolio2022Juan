import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/models/persona';
import { PersonaService } from 'src/app/servicios/persona.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {
  public persona: Persona | undefined;
  public editPersona: Persona | undefined;
  constructor( private personaService: PersonaService) { }

  ngOnInit(): void {
    this.getPersona();
  }

  public getPersona(): void{
    this.personaService.getPersona().subscribe({
        next: (response: Persona) =>{
            this.persona = response;
        },
        error:(error: HttpErrorResponse)=>{
          alert(error.message);
        }
    })
    console.log(this.persona?.fecha_nacimiento);
}
}