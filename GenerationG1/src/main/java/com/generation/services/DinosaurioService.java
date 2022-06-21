package com.generation.services;


import com.generation.models.Auto;
import com.generation.models.Dinosaurio;
import com.generation.repositories.DinosaurioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class DinosaurioService {

    @Autowired
    DinosaurioRepository dinosaurioRepository;

    public void guardarRegistro(@Valid Dinosaurio dinosaurio) {

        dinosaurioRepository.save(dinosaurio);

    }

    public List<Dinosaurio> findAll(){

        return dinosaurioRepository.findAll();


    }


}
