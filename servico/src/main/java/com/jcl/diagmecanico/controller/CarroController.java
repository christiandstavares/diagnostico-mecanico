package com.jcl.diagmecanico.controller;

import com.jcl.diagmecanico.entity.Carro;
import com.jcl.diagmecanico.entity.dto.CarroDTO;
import com.jcl.diagmecanico.service.CarroService;
import com.jcl.diagmecanico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by christian-tavares on 24/10/17.
 */
@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public ResponseEntity<Carro> salvarCarro(@RequestBody CarroDTO carroDTO) {
        Carro carro = carroDTO.getCarro();
        carro.setUsuario(usuarioService.buscarPorId(carroDTO.getIdUsuario()));
        return new ResponseEntity<>(carroService.salvar(carro), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Carro> buscarPorId(@PathVariable Long id) {
        return new ResponseEntity<>(carroService.buscarPorId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Carro>> listarTodosCarros() {
        return new ResponseEntity<>(carroService.listarTodos(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Carro> excluirCarro(@PathVariable("id") Long id) {
        carroService.excluir(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
