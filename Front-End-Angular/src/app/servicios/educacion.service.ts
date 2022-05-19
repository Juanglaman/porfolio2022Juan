import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Educacion } from '../models/educacion';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EducacionService {

  private apiServerUrl= environment.apiBaseUrl;
  constructor( private http: HttpClient) { }

  public getEducacion():Observable<Educacion[]>{
    return this.http.get<Educacion[]>(`${this.apiServerUrl}/api/educacion/all`);
  }

  public addEducacion(educacion: Educacion):Observable<Educacion>{
    return this.http.post<Educacion>(`${this.apiServerUrl}/api/educacion/crear`, educacion);
  }

  public updateEducacion(educacion: Educacion):Observable<Educacion>{
    return this.http.put<Educacion>(`${this.apiServerUrl}/api/educacion/editar`, educacion);
  }

  public deleteEducacion(id_edu: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/api/educacion/borrar/${id_edu}`);
  }

}
