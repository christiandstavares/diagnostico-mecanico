package com.jcl.diagmecanico.repository;

import com.jcl.diagmecanico.entity.ItemCarro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCarroRepository extends CrudRepository<ItemCarro, Long> {
}
