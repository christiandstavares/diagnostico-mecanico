package com.jcl.diagmecanico.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class ItemCarro implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private int ultimaRevisaoKm;
    private Date ultimaRevisaoData;
    private int vidaUtilKm;
    private int vidaUtilTempo;

    @NotNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Carro carro;
}
