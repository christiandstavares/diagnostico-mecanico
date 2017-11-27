import { Injectable, EventEmitter } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class AuthService {

  usuarioAutenticado: boolean = false;
  mostrarMenuEmitter = new EventEmitter<boolean>();

  constructor(private http: Http) { }

  fazerLogin(login: any) {
    this.http.post('//localhost:8080/login', login)
      .subscribe(dados => console.log(dados));
  }
}
