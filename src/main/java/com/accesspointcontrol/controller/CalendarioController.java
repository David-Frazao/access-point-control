package com.accesspointcontrol.controller;

import com.accesspointcontrol.model.Calendario;
import com.accesspointcontrol.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    @Autowired
    CalendarioService calendarioService;

    //Criar registro
    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario){
        return calendarioService.saveCalendario(calendario);
    }

    //Listar registros
    @GetMapping
    public List<Calendario> getCalendarioList(){
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getCalendarioByID(@PathVariable("idCalendario") Long idCalendario) throws Exception {
        return ResponseEntity.ok(calendarioService.getById(idCalendario).
                orElseThrow(() -> new NoSuchElementException("Calendário não encontrado!")));
    }

    //Atualiza/Edita registros
    @PutMapping
    public Calendario updateBancoHoras(@RequestBody Calendario calendario){
        return calendarioService.updateCalendario(calendario);
    }

    //Deleta registro
    @DeleteMapping("/{idCalendario}")
    public ResponseEntity<Calendario> deleteCalendarioByID(@PathVariable("idCalendario") Long idCalendario){
        try{
            calendarioService.deleteCalendario(idCalendario);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Calendario>) ResponseEntity.ok();
    }

}
