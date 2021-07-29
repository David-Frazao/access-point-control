package com.accesspointcontrol.service;

import com.accesspointcontrol.model.JornadaTrabalho;
import com.accesspointcontrol.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {
    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService (JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    //Cria registro de Jornada
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    //Buscar registro de Jornada
    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada){
        return jornadaRepository.findById(idJornada);
    }

    //Altera registro de Jornanda
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    //Deleta registro de Jornada
    public void deleteJornada(Long idJornada){
        jornadaRepository.deleteById(idJornada);
    }
}