package com.generation.repositories;

import com.generation.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{


    //JpaRepository<*Objeto*, *tipo de dato de la primary key*>
    /*La interface solo definen los metodos*/
    /*Querys y usar metodos que se conectan a la base de datos*/

    /*Validar la existencia del email*/

    Usuario findByEmail(String email);


}
