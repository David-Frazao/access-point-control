package com.accesspointcontrol.service;

import com.accesspointcontrol.model.Calendario;
import com.accesspointcontrol.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {
    CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository){
        this.calendarioRepository = calendarioRepository;
    }

    //Cria registro do Calendario
    public Calendario saveCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    //Busca registro do Calendario
    public List<Calendario> findAll(){
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> getById(Long idCalendario){
        return calendarioRepository.findById(idCalendario);
    }

    //Altera registro do Calendario
    public Calendario updateCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    //Deleta registro do Calendario
    public void deleteCalendario(Long idCalendario){
        calendarioRepository.deleteById(idCalendario);
    }
}