import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Educacion } from 'src/app/models/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from 'src/app/servicios/login.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  public eduList: Educacion[]=[];
  public  uLoged: string | undefined;


  /*FORMULARIOS*/
  signupForm: FormGroup;
  editarEducacionForm: FormGroup;

  constructor( private educacionService: EducacionService, private _builder: FormBuilder, private loginService: LoginService) {
    this.signupForm = this._builder.group({
      titulo_edu: ['', Validators.required],
      anioegreso: ['', Validators.required],
      descrip_edu: ['', Validators.required],
      nombinstituto: ['', Validators.required]
    })

    this.editarEducacionForm = this._builder.group({
      id_edu: ['', Validators.nullValidator],
      titulo_edu: ['', Validators.required],
      anioegreso: ['', Validators.required],
      descrip_edu: ['', Validators.required],
      nombinstituto: ['', Validators.required]
    })
  }



  ngOnInit(): void {

    this.uLoged = this.loginService.getToken();

    this.getPEducacion();

    this.loginService.uLoged$.subscribe( texto =>{
      this.uLoged= texto;
    })
  }

  public getPEducacion():void{
    this.educacionService.getEducacion().subscribe({
      next: (Response: Educacion[]) =>{
        this.eduList=Response;
      },
      error: (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public enviarEducacion(): void{

      this.educacionService.addEducacion(this.signupForm.value).subscribe({
        next: (Response: Educacion) =>{
          console.log(Response);
          this.getPEducacion();
          alert("Educacion agregada correctamente");
        },
        error:(error: HttpErrorResponse)=>{
          alert(error.message);
        }
      })
  }

  public editarEducacion(id_edu: number): void{
    this.editarEducacionForm.value.id_edu=id_edu;
    this.educacionService.updateEducacion(this.editarEducacionForm.value).subscribe({
      next: (Response: Educacion) =>{
        console.log(Response);
        alert("Educacion editada correctamente");
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
        this.getPEducacion();
      }
    })
  }

  public deleteEducacionBoton(id_edu: number):void{
    this.educacionService.deleteEducacion(id_edu).subscribe({
      next: (Response: void) =>{
        console.log(Response);
        alert("Educacion eliminada correctamente");
        this.getPEducacion();
      },
      error:(error: HttpErrorResponse)=>{
        alert(error.message);
        console.log(id_edu);
      }
    })

  }

  /*public onOpenModal(mode: String, educacion?: Educacion):void{
    const container=document.getElementById('main-container');
    const button=document.createElement('button');
    button.style.display='none';
    button.setAttribute('data-toggle', 'modal');
    if(mode==='add'){
      button.setAttribute('data-target', '#addEducacionModal');
    }else if(mode==='delete'){
      this.deleteEducacion=educacion;
      button.setAttribute('data-target', '#deleteEducacionModal');
    } else if(mode==='edit'){
      this.editEducacion=educacion;
      button.setAttribute('data-target', 'editEducacionModal');
    }
    container?.appendChild(button);
    button.click();
  }

    public onAddEducacion(addForm: NgForm){
      document.getElementById('add-educacion-form')?.click();
      this.educacionService.addEducacion(addForm.value).subscribe({
        next: (Response: Educacion) =>{
          console.log(Response);
          this.getPEducacion();
          addForm.reset();
        },
        error:(error: HttpErrorResponse)=>{
          alert(error.message);
          addForm.reset();
        }
      })

    }

    public onUpdateEducacion(educacion: Educacion){
      this.editEducacion= educacion;
      document.getElementById('add-educacion-form')?.click();
      this.educacionService.updateEducacion(educacion).subscribe({
        next: (Response: Educacion) =>{
          console.log(Response);
          this.getPEducacion();
        },
        error:(error: HttpErrorResponse)=>{
          alert(error.message);
        }
      })

    }*/


}
