import { Observable } from 'rxjs/Observable';
import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

import { Usuario } from './usuario';
import { AuthService } from '../login/auth.service';

@Injectable()
export class UsuarioService {

  constructor(
    private http: Http,
    private authService: AuthService
  ) { }

  cadastrar(usuario: Usuario) {
    this.http.post('/api/usuarios', usuario)
      .map(response => response.json())
      .subscribe(response => {
        let login = {
          email: response.email,
          senha: response.senha
        };

        this.authService.fazerLogin(login);
      });
  }

  getUsuario(id: number): Observable<Usuario> {
    return this.http.get('/api/usuarios/' + id)
      .map(response => {
        return <Usuario>response.json();
      });
  }

}
