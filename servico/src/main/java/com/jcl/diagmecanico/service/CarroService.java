package com.jcl.diagmecanico.service;

import com.jcl.diagmecanico.entity.Carro;
import com.jcl.diagmecanico.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by christian-tavares on 24/10/17.
 */
@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private ItemCarroService itemCarroService;

    public Carro salvar(Carro carro) {
        boolean idNulo = carro.getId() == null;
        Carro carroSalvo = carroRepository.save(carro);

        if (idNulo) {
            carroSalvo.setItens(itemCarroService.setItensDefault(carroSalvo));
        }

        return carroSalvo;
    }

    public List<Carro> listarTodos() {
        return carroRepository.findAll();
    }

    public void excluir(Long id) {
        carroRepository.delete(id);
    }
}
