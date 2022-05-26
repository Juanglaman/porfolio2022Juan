import { EventEmitter, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { environment } from 'src/environments/environment';
import { CookieService } from 'ngx-cookie-service';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private apiServerUrl= environment.apiBaseUrl;

  uLoged$ = new EventEmitter<string>();

  constructor( private http: HttpClient, private cookie: CookieService) { }

  login( usuario: any): Observable<any> {
      return this.http.post(`${this.apiServerUrl}/api/login/`, usuario);
  }

  setToken(token: string){
      this.cookie.set("token", token);
  }

  getToken(){
    return this.cookie.get("token");
  }

  deleteToken(){
      this.cookie.delete("token");

  }
}
