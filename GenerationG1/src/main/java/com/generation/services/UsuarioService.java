package com.generation.services;


import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UsuarioService {

    //Llamar al Repository (inyeccion de depencia)

    @Autowired
    UsuarioRepository usuarioRepository;


    public void saveUsuario(Usuario usuario) {

        usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll(){

        return usuarioRepository.findAll();


    }
    /*Logica de negocio, o validaciones del sistema*/
    /*LLama al repository y a los metodos*/

}
