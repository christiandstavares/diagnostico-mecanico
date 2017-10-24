package com.jcl.diagmecanico.repository;

import com.jcl.diagmecanico.entity.Carro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by christian-tavares on 24/10/17.
 */
@Repository
public interface CarroRepository extends CrudRepository<Carro, Long> {
}
