package com.accesspointcontrol.controller;

import com.accesspointcontrol.model.BancoHoras;
import com.accesspointcontrol.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/banco-horas")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.saveBancoHoras(bancoHoras) ;
    }

    @GetMapping
    public List<BancoHoras> getBancoHorasList(){
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> getBancoHorasByID(@PathVariable("idBancoHoras") Long idBancoHoras) throws Exception {
        return ResponseEntity.ok(bancoHorasService.getById(idBancoHoras)
                .orElseThrow(() -> new NoSuchElementException("Banco de Horas não encontrado!")));
    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.updateBancoHoras(bancoHoras);
    }

    @DeleteMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> deleteBancoHorasByID(@PathVariable("idBancoHoras") Long idBancoHoras){
        try{
            bancoHorasService.deleteBancoHoras(idBancoHoras);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
    }
}