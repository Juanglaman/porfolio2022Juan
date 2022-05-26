import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Tecnologia } from 'src/app/models/tecnologia';
import { LoginService } from 'src/app/servicios/login.service';
import { TecnologiasService } from 'src/app/servicios/tecnologias.service';

@Component({
  selector: 'app-tecnologias',
  templateUrl: './tecnologias.component.html',
  styleUrls: ['./tecnologias.component.css']
})
export class TecnologiasComponent implements OnInit {

  public tecnoList: Tecnologia[]=[];
  public  uLoged: string | undefined;
  signupTecnoForm: FormGroup;

  constructor( private tecnologiaService: TecnologiasService, private loginService: LoginService, private _builder: FormBuilder) {
    this.signupTecnoForm = this._builder.group({
      nombre_tec: ['', Validators.required],
      porcentaje: ['', Validators.required],
      url_imagen_tec: ['', Validators.nullValidator]
    })
   }

  ngOnInit(): void {
    this.uLoged = this.loginService.getToken();

    this.getPTecnologias();

    this.loginService.uLoged$.subscribe( texto =>{
      this.uLoged= texto;
    })
  }

  public getPTecnologias():void{
    this.tecnologiaService.getTecnologia().subscribe({
      next: (Response: Tecnologia[]) =>{
        this.tecnoList=Response;
      },
      error: (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public enviar(): void{

    this.tecnologiaService.addTecnologia(this.signupTecnoForm.value).subscribe({
      next: (Response: Tecnologia) =>{
        console.log(Response);
        this.getPTecnologias();
        alert("Tenologia agregada correctamente");
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }
  public deleteTecnologia(id_tec: number):void{
    this.tecnologiaService.deleteTecnologia(id_tec).subscribe({
      next: (Response: void) =>{
        console.log(Response);
        alert("Tecnologia eliminada correctamente");
        this.getPTecnologias();
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
        console.log(id_tec);
      }
    })
  }
}
