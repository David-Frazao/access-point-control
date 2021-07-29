package com.accesspointcontrol.service;

import com.accesspointcontrol.model.TipoData;
import com.accesspointcontrol.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository ){
        this.tipoDataRepository = tipoDataRepository;
    }

    //Cria registro Tipo Data
    public TipoData saveTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    //Busca registro de Tipo Data
    public List<TipoData> findAll(){
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> getById(Long idTipoData){
        return tipoDataRepository.findById(idTipoData);
    }

    //Altera registro de Tipo Data
    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    //Deleta registro do Tipo Data
    public void deleteTipoData(Long idTipoData){
        tipoDataRepository.deleteById(idTipoData);
    }
}