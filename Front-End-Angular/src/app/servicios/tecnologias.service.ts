import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Tecnologia } from '../models/tecnologia';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class TecnologiasService {

  private apiServerUrl= environment.apiBaseUrl;
  constructor( private http: HttpClient) { }

  public getTecnologia():Observable<Tecnologia[]>{
    return this.http.get<Tecnologia[]>(`${this.apiServerUrl}/api/tecnologia/all`);
  }

  public addTecnologia(tecnologia: Tecnologia):Observable<Tecnologia>{
    return this.http.post<Tecnologia>(`${this.apiServerUrl}/api/tecnologia/crear/`, tecnologia);
  }

  public updateTecnologia(tecnologia: Tecnologia):Observable<Tecnologia>{
    return this.http.put<Tecnologia>(`${this.apiServerUrl}/api/tecnologia/editar/`, tecnologia);
  }

  public deleteTecnologia(id_tec: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/api/tecnologia/borrar/${id_tec}`);
  }
}
