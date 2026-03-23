package com.gerenciamento.departamentos.services;


import com.gerenciamento.departamentos.models.Departamento;
import com.gerenciamento.departamentos.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Departamento> findAll(){
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> findById(Long id){
        return departamentoRepository.findById(id);
    }

    public void delete(Long id){
        departamentoRepository.deleteById(id);
    }

    public Departamento save(Departamento departamento){
        return departamentoRepository.save(departamento);
    }
}
