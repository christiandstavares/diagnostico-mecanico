package com.jcl.diagmecanico.service;

import com.jcl.diagmecanico.entity.Carro;
import com.jcl.diagmecanico.entity.ItemCarro;
import com.jcl.diagmecanico.entity.enums.ItensDefaultEnum;
import com.jcl.diagmecanico.repository.ItemCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemCarroService {

    @Autowired
    private ItemCarroRepository itemCarroRepository;

    public List<ItemCarro> setItensDefault(Carro carro) {
        List<ItemCarro> itensDefault = new ArrayList<>();

        Arrays.stream(ItensDefaultEnum.values()).forEach(item -> {
            ItemCarro itemCarro = new ItemCarro();
            itemCarro.setDescricao(item.getDescricao());
            itemCarro.setVidaUtilTempo(item.getVidaUtilTempo());
            itemCarro.setVidaUtilKm(item.getVidaUtilKm());
            itemCarro.setCarro(carro);

            itensDefault.add(salvar(itemCarro));
        });

        return itensDefault;
    }

    public List<ItemCarro> salvar(List<ItemCarro> itens, Carro carro) {
        List<ItemCarro> itensSalvos = new ArrayList<>();

        itens.forEach(item -> {
            item.setCarro(carro);
            itensSalvos.add(salvar(item));
        });

        return itensSalvos;
    }

    public ItemCarro salvar(ItemCarro itemCarro) {
        return itemCarroRepository.save(itemCarro);
    }
}
