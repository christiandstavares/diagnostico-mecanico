import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

import { Usuario } from './usuario';
import { UsuarioService } from './usuario.service';

declare var Materialize: any;

@Component({
    selector: 'app-usuario',
    templateUrl: './usuario.component.html',
    styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

    private usuario: Usuario = new Usuario('', '', '');
    private confirmacaoSenha: string = '';

    constructor(
        private usuarioService: UsuarioService
    ) { }

    ngOnInit() {
    }

    cadastrar(form: NgForm) {
        if (form.valid && this.usuario.senha == this.confirmacaoSenha) {
            this.usuarioService.cadastrar(this.usuario);
        } else if (form.invalid) {
            Materialize.toast("Preencha os campos obrigatórios!", 4000, "toast-error");
        } else {
            Materialize.toast("As senhas são diferentes!", 4000, "toast-error");
        }
    } 
}
