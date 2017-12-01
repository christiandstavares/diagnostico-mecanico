import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs/Observable';

import { Usuario } from './usuario';
import { UsuarioService } from './usuario.service';

@Injectable()
export class UsuarioResolver implements Resolve<Usuario> {

    constructor(private usuarioService: UsuarioService) {}

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Usuario | Observable<Usuario> | Promise<Usuario> {

        let id = route.params['idUsuario'];

        return this.usuarioService.getUsuario(id);
    }

}