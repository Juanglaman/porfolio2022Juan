import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { PersonaComponent } from './componentes/persona/persona.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { LaboralComponent } from './componentes/laboral/laboral.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PersonaComponent,
    EducacionComponent,
    LaboralComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
