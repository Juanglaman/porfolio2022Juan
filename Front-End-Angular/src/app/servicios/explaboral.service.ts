import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Explaboral } from '../models/explaboral';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ExplaboralService {

  private apiServerUrl= environment.apiBaseUrl;
  constructor( private http: HttpClient) { }

  public getExplaboral():Observable<Explaboral[]>{
    return this.http.get<Explaboral[]>(`${this.apiServerUrl}/api/explaboral/all`);
  }

  public crearExplaboral(labo: Explaboral):Observable<Explaboral>{
    return this.http.post<Explaboral>(`${this.apiServerUrl}/api/explaboral/crear`, labo);
  }

  public actualizarExplaboral(labo: Explaboral):Observable<Explaboral>{
    return this.http.put<Explaboral>(`${this.apiServerUrl}/api/explaboral/editar/`, labo);
  }

  public borrarExplaboral(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/api/explaboral/delete/${id}`);
  }

}
