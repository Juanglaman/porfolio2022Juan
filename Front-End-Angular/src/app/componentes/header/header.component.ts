import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/servicios/login.service';

import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  public  uLoged: string | undefined;
  constructor( private loginService: LoginService, private route: Router) { }

  ngOnInit(): void {
    this.uLoged = this.loginService.getToken();

    this.loginService.uLoged$.subscribe( texto =>{
      this.uLoged= texto;
    })
  }

  public salir():void{
    this.loginService.deleteToken();
    this.loginService.uLoged$.emit('2');
    console.log(this.uLoged);
    this.route.navigate(['/inicio']);
  }
}
