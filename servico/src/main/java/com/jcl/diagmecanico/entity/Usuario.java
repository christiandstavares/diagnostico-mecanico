package com.jcl.diagmecanico.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private String senha;

    @OneToMany(mappedBy = "usuario")
    private List<Carro> carros;
}
