import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Proyectos } from '../models/proyectos';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProyectosService {

  private apiServerUrl= environment.apiBaseUrl;
  constructor( private http: HttpClient) { }

  public getProyectos():Observable<Proyectos[]>{
    return this.http.get<Proyectos[]>(`${this.apiServerUrl}/api/proyectos/all`);
  }

  public addProyectos(proyectos: Proyectos):Observable<Proyectos>{
    return this.http.post<Proyectos>(`${this.apiServerUrl}/api/proyectos/crear/`, proyectos);
  }

  public updateProyectos(proyectos: Proyectos):Observable<Proyectos>{
    return this.http.put<Proyectos>(`${this.apiServerUrl}/api/proyectos/editar/`, proyectos);
  }

  public deleteProyectos(id_pro: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/api/proyectos/borrar/${id_pro}`);
  }
}
