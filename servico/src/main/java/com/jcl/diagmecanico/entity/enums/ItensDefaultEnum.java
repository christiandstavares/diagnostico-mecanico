package com.jcl.diagmecanico.entity.enums;

import lombok.Getter;

@Getter
public enum ItensDefaultEnum {

    OLEO_FILTRO_MOTOR("Óleo e Filtro do Motor", 6, 10000),
    FLUIDO_FREIO("Fluído do Freio", 12, 10000),
    SISTEMA_FREIOS("Sistema de Freios", 0, 10000),
    SISTEMA_ARREFECIMENTO("Sistema de Arrefecimento", 0, 30000),
    FILTRO_COMBUSTIVEL("Filtro de Combustível", 0, 10000),
    ALINHAMENTO_BALANCEAMENTO("Alinhamento e Balanceamento", 0, 10000);

    private String descricao;
    private int vidaUtilTempo;
    private int vidaUtilKm;

    ItensDefaultEnum(String descricao, int vidaUtilTempo, int vidaUtilKm) {
        this.descricao = descricao;
        this.vidaUtilTempo = vidaUtilTempo;
        this.vidaUtilKm = vidaUtilKm;
    }
}
