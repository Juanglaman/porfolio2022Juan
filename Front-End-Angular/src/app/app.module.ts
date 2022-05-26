import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CookieService } from 'ngx-cookie-service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { PersonaComponent } from './componentes/persona/persona.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import { LaboralComponent } from './componentes/laboral/laboral.component';
import { ModalComponent } from './componentes/modal/modal.component';
import { TecnologiasComponent } from './componentes/tecnologias/tecnologias.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { FooterComponent } from './componentes/footer/footer.component';
import { LoginComponent } from './componentes/login/login.component';
import { InicioComponent } from './componentes/inicio/inicio.component';
import { NgCircleProgressModule } from 'ng-circle-progress';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PersonaComponent,
    EducacionComponent,
    LaboralComponent,
    ModalComponent,
    TecnologiasComponent,
    ProyectosComponent,
    FooterComponent,
    LoginComponent,
    InicioComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    NgCircleProgressModule.forRoot({})
  ],
  providers:
  [CookieService],
  bootstrap: [AppComponent]
})
export class AppModule { }
