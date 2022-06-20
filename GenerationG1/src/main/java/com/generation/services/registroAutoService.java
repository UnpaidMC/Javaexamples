package com.generation.services;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class registroAutoService {

    @Autowired
    AutoRepository autoRepository;


    public void saveRegistro(@Valid Auto auto) {

        autoRepository.save(auto);
    }
    public List<Auto> findAll(){

        return autoRepository.findAll();


    }

    public Auto buscarId(Long id){

    return autoRepository.findById(id).get();//.get() especificamos el tipo de dato

    }

    public void eliminarAuto(Long id){

        autoRepository.deleteById(id);

    }



}
