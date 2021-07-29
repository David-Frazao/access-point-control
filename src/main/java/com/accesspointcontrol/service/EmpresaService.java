package com.accesspointcontrol.service;

import com.accesspointcontrol.model.Empresa;
import com.accesspointcontrol.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    //Cria registro da Empresa
    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    //Busca registro da Empresa
    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getById(Long idEmpresa){
        return empresaRepository.findById(idEmpresa);
    }

    //Altera registro da Empresa
    public Empresa updateEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    //Deleta registro da Empresa
    public void deleteEmpresa(Long idEmpresa){
        empresaRepository.deleteById(idEmpresa);
    }
}