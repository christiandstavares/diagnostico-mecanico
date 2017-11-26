package com.jcl.diagmecanico.service;

import com.jcl.diagmecanico.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UsuarioService usuarioService;

    public Usuario logar(String email, String senha) {
        return usuarioService.buscarUsuarioPorEmailESenha(email, senha);
    }
}
