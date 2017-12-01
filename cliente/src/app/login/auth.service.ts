import { Injectable, EventEmitter } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

import { Usuario } from './../usuario/usuario';
import { Router } from '@angular/router';

@Injectable()
export class AuthService {

  usuarioAutenticado: Usuario = null;
  mostrarMenuUsuarioEmitter = new EventEmitter<boolean>();

  constructor(
    private http: Http,
    private router: Router
  ) { }

  fazerLogin(login: any) {
    this.http.post('/api/login', login)
      .map(dados => dados.json())
      .subscribe(dados => {
        this.usuarioAutenticado = dados;
        this.mostrarMenuUsuarioEmitter.emit(false);
        this.router.navigate(['usuario', dados.id]);
      });
  }
}
