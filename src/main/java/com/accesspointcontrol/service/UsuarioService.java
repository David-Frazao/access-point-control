package com.accesspointcontrol.service;

import com.accesspointcontrol.model.Usuario;
import com.accesspointcontrol.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //Cria registro de Usuário
    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //Busca registro de Usuário
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getById(Long idUsuario){
        return usuarioRepository.findById(idUsuario);
    }

    //Altera registro de Usuário
    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //Deleta registro do Usuário
    public void deleteUsuario(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }
}
