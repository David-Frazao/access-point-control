package com.accesspointcontrol.service;

import com.accesspointcontrol.model.BancoHoras;
import com.accesspointcontrol.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {
    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository){
        this.bancoHorasRepository = bancoHorasRepository;
    }

    //Cria registro de Banco de Horas
    public BancoHoras saveBancoHoras (BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    //Busca registro de Banco de Horas
    public List<BancoHoras> findAll(){
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(Long idBancoHoras){
        return bancoHorasRepository.findById(idBancoHoras);
    }

    //Altera registro de Banco de Horas
    public BancoHoras updateBancoHoras(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    //Deleta registro de Banco de Horas
    public void deleteBancoHoras(Long idBancoHoras){
        bancoHorasRepository.deleteById(idBancoHoras);
    }
}