import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

import { AuthService } from './auth.service';

declare var Materialize: any;

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

    private login: any = {
        email: '',
        senha: ''
    };

    constructor(private authService: AuthService) { }

    ngOnInit() {
    }

    fazerLogin(form: NgForm) {
        if (form.valid) {
            this.authService.fazerLogin(this.login);
        } else {
            Materialize.toast("Preencha os campos obrigatórios!", 4000, "toast-error");
        }
    }
}
