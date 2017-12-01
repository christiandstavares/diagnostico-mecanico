import { Observable } from 'rxjs/Observable';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';

import { Carro } from './carro';
import { CarroService } from './carro.service';

@Injectable()
export class CarroResolver implements Resolve<Carro> {

    constructor(private carroService: CarroService) {}

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Carro | Observable<Carro> | Promise<Carro> {

        let id = route.params['idCarro'];

        return this.carroService.getCarro(id);
    }

}