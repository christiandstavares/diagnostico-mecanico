import { Observable } from 'rxjs/Observable';
import { Http } from '@angular/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import 'rxjs/add/operator/map';

import { Carro } from './carro';

@Injectable()
export class CarroService {

  constructor(
    private http: Http,
    private router: Router
  ) { }

  cadastrar(carro: Carro, idUsuario: number) {
    let carroDTO: any = {
      carro: carro,
      idUsuario: idUsuario
    };

    this.http.post('/api/carros', carroDTO)
      .subscribe(response => {
        this.router.navigate(['/usuario', idUsuario])
      });
  }

  salvar(carro: Carro, idUsuario: number): void {
    let carroDTO: any = {
      carro: carro,
      idUsuario: idUsuario
    };

    this.http.post('/api/carros', carroDTO)
      .subscribe();
  }

  getCarro(id: number) {
    return this.http.get('/api/carros/' + id)
      .map(response => {
      return <Carro>response.json();
    });
  }
}
