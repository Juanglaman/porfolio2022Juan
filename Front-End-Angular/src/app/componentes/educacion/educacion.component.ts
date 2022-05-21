import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Educacion } from 'src/app/models/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  public eduList: Educacion[]=[];
  public addEducacion: Educacion | undefined;

  /*public editEducacion: Educacion | undefined;*/
  public deleteEducacion: Educacion | undefined;

  signupForm: FormGroup;

  constructor( private educacionService: EducacionService, private _builder: FormBuilder) {
    this.signupForm = this._builder.group({
      titulo_edu: ['', Validators.required],
      anioegreso: ['', Validators.required],
      descrip_edu: ['', Validators.required],
      nombinstituto: ['', Validators.required]
    })

  }



  ngOnInit(): void {
    this.getPEducacion();
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

  enviar(){
      console.log(this.signupForm.value);


      this.educacionService.addEducacion(this.signupForm.value).subscribe({
        next: (Response: Educacion) =>{
          console.log(Response);
          this.getPEducacion();
          this.signupForm.reset();
        },
        error:(error: HttpErrorResponse)=>{
          alert(error.message);
          this.signupForm.reset();
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

    public deleteEducacionBoton(id_edu: number):void{
      this.educacionService.deleteEducacion(id_edu).subscribe({
        next: (Response: void) =>{
          console.log(Response);
          this.getPEducacion();
        },
        error:(error: HttpErrorResponse)=>{
          alert(error.message);
          console.log(id_edu);
        }
      })

    }
}
