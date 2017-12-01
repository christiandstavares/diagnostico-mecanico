import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppRoutingModule } from './app-routing.module';
import { MaterializeModule } from 'angular2-materialize';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AuthService } from './login/auth.service';
import { HomeComponent } from './home/home.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { UsuarioService } from './usuario/usuario.service';
import { CarroComponent } from './carro/carro.component';
import { ListaCarrosComponent } from './lista-carros/lista-carros.component';
import { UsuarioResolver } from './usuario/usuario.resolver';
import { CarroService } from './carro/carro.service';
import { CarroDetalheComponent } from './carro-detalhe/carro-detalhe.component';
import { CarroResolver } from './carro/carro.resolver';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    UsuarioComponent,
    CarroComponent,
    ListaCarrosComponent,
    CarroDetalheComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterializeModule,
    FormsModule,
    HttpModule
  ],
  providers: [
    AuthService,
    UsuarioService,
    UsuarioResolver,
    CarroService,
    CarroResolver
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
