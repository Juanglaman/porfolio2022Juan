import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';
import { LoginService } from 'src/app/servicios/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  correo: string = "";
  password: string= "";
  loginerror: string= "";

  constructor( private router: Router, private loginService: LoginService, private route: ActivatedRoute) { }

  ngOnInit(): void {


  }
  login(){
    //console.log(this.correo);
    //console.log(this.password);

    const user= { correo: this.correo, password: this.password};
    console.log(user);
    this.loginService.login(user).subscribe ( data =>{
        console.log(data);
        if (data==null) this.loginerror= "Error!! Usuario no encontrado.";
        else{
          this.loginerror= " ";
          this.loginService.setToken(data.id);
          this.router.navigate(['/inicio']);
        }
    });
  }
}
