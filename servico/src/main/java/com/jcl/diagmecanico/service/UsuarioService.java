package com.jcl.diagmecanico.service;

import com.jcl.diagmecanico.entity.Usuario;
import com.jcl.diagmecanico.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuarioPorEmailESenha(String email, String senha) {
        return usuarioRepository.findByEmailAndSenha(email, senha);
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findOne(id);
    }
}
