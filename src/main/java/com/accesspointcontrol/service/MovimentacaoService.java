package com.accesspointcontrol.service;

import com.accesspointcontrol.model.Movimentacao;
import com.accesspointcontrol.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository){
        this.movimentacaoRepository = movimentacaoRepository;
    }

    //Cria registro Movimentação
    public Movimentacao saveMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    //Busca registro de Movimentação
    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> getById(Long idMovimentacao){
        return movimentacaoRepository.findById(idMovimentacao);
    }

    //Altera registro de Movimentação
    public Movimentacao updateMovimentacao(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    //Deleta registro de Movimentação
    public void deleteMovimentacao(Long idMovimentacao){
        movimentacaoRepository.deleteById(idMovimentacao);
    }
}