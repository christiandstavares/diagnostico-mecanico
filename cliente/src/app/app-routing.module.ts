import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { ListaCarrosComponent } from './lista-carros/lista-carros.component';
import { UsuarioResolver } from './usuario/usuario.resolver';
import { CarroComponent } from './carro/carro.component';
import { CarroResolver } from './carro/carro.resolver';
import { CarroDetalheComponent } from './carro-detalhe/carro-detalhe.component';

const routes: Routes = [
    {
        path: 'login',
        component: LoginComponent
    },
    {
        path: 'usuario',
        component: UsuarioComponent
    },
    {
        path: 'usuario/:idUsuario',
        component: ListaCarrosComponent,
        resolve: {
            usuario: UsuarioResolver
        }
    },
    {
        path: 'usuario/:idUsuario/carro',
        component: CarroComponent
    },
    {
        path: 'usuario/:idUsuario/carro/:idCarro',
        component: CarroDetalheComponent,
        resolve: {
            carro: CarroResolver
        }
    },
    {
        path: '',
        component: HomeComponent
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
