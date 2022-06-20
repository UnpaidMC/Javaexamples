package com.generation.repositories;

import com.generation.models.Auto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long>{


    //JpaRepository<*Objeto*, *tipo de dato de la primary key*>
    /*La interface solo definen los metodos*/
    /*Querys y usar metodos que se conectan a la base de datos*/


}