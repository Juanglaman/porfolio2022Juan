import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { Explaboral } from 'src/app/models/explaboral';
import { ExplaboralService } from 'src/app/servicios/explaboral.service';

@Component({
  selector: 'app-laboral',
  templateUrl: './laboral.component.html',
  styleUrls: ['./laboral.component.css']
})
export class LaboralComponent implements OnInit {

  public expLaboList: Explaboral[]=[];
  constructor( private explaboServices: ExplaboralService) { }

  ngOnInit(): void {
      this.getPExpLaboral();
  }

  public getPExpLaboral():void{
    this.explaboServices.getExplaboral().subscribe({
      next: (Response: Explaboral[]) =>{
        this.expLaboList=Response;
      },
      error: (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }
}
