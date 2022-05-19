import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Persona } from '../models/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  private apiServerUrl= environment.apiBaseUrl;

  constructor( private http: HttpClient) { }

  public getPersona():Observable<Persona>{
    return this.http.get<Persona>(`${this.apiServerUrl}/api/persona/1`);
  }

  public actualizarPersona(persona: Persona):Observable<Persona>{
    return this.http.put<Persona>(`${this.apiServerUrl}/persona/editar/`, persona);
  }

  public borrarPersona(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/api/persona/borrar/${id}`);
  }
}
