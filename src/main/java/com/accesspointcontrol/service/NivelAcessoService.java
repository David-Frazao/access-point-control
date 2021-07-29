package com.accesspointcontrol.service;

import com.accesspointcontrol.model.NivelAcesso;
import com.accesspointcontrol.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {
    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository){
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    //Cria registro Nivel de Acesso
    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    //Busca registro Nivel de Acesso
    public List<NivelAcesso> findAll(){
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long idNivelAcesso){
        return nivelAcessoRepository.findById(idNivelAcesso);
    }

    //Altera registro Nivel de Acesso
    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    //Deleta registro Nivel de Acesso
    public void deleteNivelAcesso(Long idNivelAcesso){
        nivelAcessoRepository.deleteById(idNivelAcesso);
    }
}