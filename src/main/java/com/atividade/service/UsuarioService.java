package com.atividade.service;

import com.atividade.model.Usuario;
import com.atividade.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario saveUsuario (Usuario newUsuario){
        newUsuario.setName(newUsuario.getName());
        return usuarioRepository.save(newUsuario);
    }

    public void excluir(Long id) {

        usuarioRepository.deleteById(id);
    }

}
