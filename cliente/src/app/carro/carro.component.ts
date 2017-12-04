import { NgForm } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';

import { Carro } from './carro';
import { CarroService } from './carro.service';

declare var Materialize: any;

@Component({
    selector: 'app-carro',
    templateUrl: './carro.component.html',
    styleUrls: ['./carro.component.css']
})
export class CarroComponent implements OnInit {

    carro: Carro = new Carro();
    idUsuario: number;

    constructor(
        private carroService: CarroService,
        private route: ActivatedRoute
    ) { }

    ngOnInit() {
        this.route.params.subscribe(
            params => {
                this.idUsuario = +params['idUsuario']
            }
        );
    }

    cadastrar(form: NgForm) {
        if (form.valid) {
            this.carroService.cadastrar(this.carro, this.idUsuario);
            Materialize.toast("Carro cadastrado com sucesso!", 4000, "toast-success");
        } else {
            Materialize.toast("Preencha os campos obrigatórios!", 4000, "toast-error");
        }
    }

}
