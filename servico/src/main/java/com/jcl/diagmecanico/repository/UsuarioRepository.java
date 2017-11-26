package com.jcl.diagmecanico.repository;

import com.jcl.diagmecanico.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByEmailAndSenha(String email, String senha);
}
