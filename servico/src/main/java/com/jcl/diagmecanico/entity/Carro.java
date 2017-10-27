package com.jcl.diagmecanico.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by christian-tavares on 24/10/17.
 */
@Entity
@Getter
@Setter
public class Carro implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    private String placa;
}
