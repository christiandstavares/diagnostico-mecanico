package com.jcl.diagmecanico.controller;

import com.jcl.diagmecanico.entity.Carro;
import com.jcl.diagmecanico.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by christian-tavares on 24/10/17.
 */
@RestController
public class CarroController {

    @Autowired
    private CarroService carroService;

    @RequestMapping(value = "/olamundo", method = RequestMethod.GET)
    public ResponseEntity<String> olaMundo() {
        return new ResponseEntity<>("Olá Mundo!", HttpStatus.OK);
    }

    @RequestMapping(value = "/carro", method = RequestMethod.POST)
    public ResponseEntity<Carro> salvarCarro(@RequestBody Carro carro) {
        return new ResponseEntity<>(carroService.salvar(carro), HttpStatus.CREATED);
    }
}
