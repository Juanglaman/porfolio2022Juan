import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Educacion } from 'src/app/models/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  public eduList: Educacion[]=[];

  constructor( private educacionService: EducacionService) { }

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

}
