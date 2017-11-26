package com.jcl.diagmecanico.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

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
    private String modelo;
    private int km;
    private String placa;
    private int ano;

    @OneToMany(mappedBy = "carro")
    private List<ItemCarro> itens;

    @NotNull
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Usuario usuario;
}
