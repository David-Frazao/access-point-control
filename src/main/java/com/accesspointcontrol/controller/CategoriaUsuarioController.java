package com.accesspointcontrol.controller;

import com.accesspointcontrol.model.CategoriaUsuario;
import com.accesspointcontrol.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria-usuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> getCategoriaUsuarioByID(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) throws Exception {
        return ResponseEntity.ok(categoriaUsuarioService.getById(idCategoriaUsuario).
                orElseThrow(() -> new NoSuchElementException("Categoria Usuário não encontrada!")));
    }

    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> deleteCategoriaUsuarioByID(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario){
        try{
            categoriaUsuarioService.deleteCategoriaUsuario(idCategoriaUsuario);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();
    }
}