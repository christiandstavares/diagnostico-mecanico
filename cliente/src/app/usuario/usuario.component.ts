import { Component, OnInit } from '@angular/core';

import { Usuario } from './usuario';
import { UsuarioService } from './usuario.service';

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

  cadastrar() {
    if (this.usuario.senha == this.confirmacaoSenha) {
      this.usuarioService.cadastrar(this.usuario);
    }
  } 

}
