package com.jcl.diagmecanico.controller;

import com.jcl.diagmecanico.entity.Usuario;
import com.jcl.diagmecanico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.salvar(usuario), HttpStatus.CREATED);
    }
}
