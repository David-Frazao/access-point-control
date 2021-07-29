package com.accesspointcontrol.service;

import com.accesspointcontrol.model.Localidade;
import com.accesspointcontrol.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {
    LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository){
        this.localidadeRepository = localidadeRepository;
    }

    //Cria registro Localidade
    public Localidade saveLocalidade(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    //Busca registro de Localidade
    public List<Localidade> findAll(){
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> getById(Long idLocalidade){
        return localidadeRepository.findById(idLocalidade);
    }

    //Altera registro de Localidade
    public Localidade updateLocalidade(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    //Deleta registro de Localidade
    public void deleteLocalidade(Long idLocalidade){
        localidadeRepository.deleteById(idLocalidade);
    }
}