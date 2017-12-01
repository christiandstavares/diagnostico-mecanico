package com.jcl.diagmecanico.entity.dto;

import com.jcl.diagmecanico.entity.Carro;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CarroDTO implements Serializable{

    private Long idUsuario;
    private Carro carro;
}
