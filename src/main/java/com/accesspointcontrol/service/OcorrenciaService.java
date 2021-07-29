package com.accesspointcontrol.service;

import com.accesspointcontrol.model.Ocorrencia;
import com.accesspointcontrol.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    OcorrenciaRepository ocorrenciaRepository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository){
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    //Cria registro de Ocorrencia
    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    //Busca registro de Ocorrencia
    public List<Ocorrencia> findAll(){
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> getById(Long idOcorrencia){
        return ocorrenciaRepository.findById(idOcorrencia);
    }

    //Altera registro de Ocorrencia
    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    //Deleta registro de Ocorrencia
    public void deleteOcorrencia(Long idOcorrencia){
        ocorrenciaRepository.deleteById(idOcorrencia);
    }
}