package com.jcl.diagmecanico.controller;

import com.jcl.diagmecanico.entity.Usuario;
import com.jcl.diagmecanico.entity.dto.LoginDTO;
import com.jcl.diagmecanico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Usuario> logar(@RequestBody LoginDTO loginDTO) {
        return new ResponseEntity<>(usuarioService.buscarUsuarioPorEmailESenha(loginDTO.getEmail(), loginDTO.getSenha()), HttpStatus.OK);
    }
}
