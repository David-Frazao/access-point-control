package com.accesspointcontrol.service;

import com.accesspointcontrol.model.CategoriaUsuario;
import com.accesspointcontrol.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository){
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    //Cria registro Categoria Usuário
    public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    //Busca registro de Categoria Usuário
    public List<CategoriaUsuario> findAll(){
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long idCategoriaUsuario){
        return categoriaUsuarioRepository.findById(idCategoriaUsuario);
    }

    //Altera registro de Categoria Usuário
    public CategoriaUsuario updateCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario) ;
    }

    //Deleta registro do Categoria Usuário
    public void deleteCategoriaUsuario(Long idCategoriaUsuario){
        categoriaUsuarioRepository.deleteById(idCategoriaUsuario);
    }
}
