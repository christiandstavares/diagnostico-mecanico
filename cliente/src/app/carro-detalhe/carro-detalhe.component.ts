import { CarroService } from './../carro/carro.service';
import { Subscription } from 'rxjs/Subscription';
import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';

import { Carro } from './../carro/carro';

@Component({
  selector: 'app-carro-detalhe',
  templateUrl: './carro-detalhe.component.html',
  styleUrls: ['./carro-detalhe.component.css']
})
export class CarroDetalheComponent implements OnInit {

  carro: Carro = new Carro();
  idUsuario: number;
  idCarro: number;
  inscricao: Subscription;
  itensAlerta: any[] = [];

  constructor(
    private route: ActivatedRoute,
    private carroService: CarroService
  ) {}

  ngOnInit() {
    this.route.params.subscribe(
      params => {
        this.idUsuario = +params['idUsuario'];
        this.idCarro = +params['idCarro'];
      }
    );

    this.inscricao = this.route.data.subscribe(
      (info) => {
        this.carro = info.carro;
        this.atualizarAlertaItens();
      }
    );
  }

  salvar() {
    this.carroService.salvar(this.carro, this.idUsuario);
    this.atualizarAlertaItens();
  }

  atualizarAlertaItens() {
    this.itensAlerta = [];

    for (let i=0; i<this.carro.itens.length; i++) {
      if (this.carro.km - parseInt(this.carro.itens[i].ultimaRevisaoKm.toString()) > this.carro.itens[i].vidaUtilKm) {
        this.itensAlerta.push(this.carro.itens[i].descricao);
      }
    }
  }
}
