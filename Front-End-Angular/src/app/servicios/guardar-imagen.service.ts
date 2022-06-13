import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GuardarImagenService {
  private apiServUrl = environment.apImagen;

  constructor( private http: HttpClient) { }

  public addImagen(formuData: FormData){
    return this.http.post(`${this.apiServUrl}/upload/`, formuData)
    .subscribe (res =>{
      console.log("respuesta: ", res );
    })
    console.log("Service ", formuData);
  }
}
