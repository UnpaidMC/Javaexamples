package com.generation.services;


import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UsuarioService {

    //Llamar al Repository (inyeccion de depencia)
    @Autowired
    UsuarioRepository usuarioRepository;


    public boolean saveUsuario(Usuario usuario) {
        boolean error = true;
        /*Proceso de validacion de datos*/
        //1-) Validar si el correo existe en la base de datos
        Usuario existeusuario = usuarioRepository.findByEmail(usuario.getEmail());

        //Si no existe el usuario, lo creamos
        if (existeusuario == null) {
            //2-) Encriptar el password
            String passEncriptado = BCrypt.hashpw(usuario.getPassword(),BCrypt.gensalt());
            usuario.setPassword(passEncriptado);
            usuarioRepository.save(usuario);
            error =false;
        } else {
            error = true;
        }
        return error;
    }

    public List<Usuario> findAll(){

        return usuarioRepository.findAll();


    }

    public boolean validarUsuario(String email, String password) {
        boolean error = true;
        // verificar el email
        Usuario existeUsuario = usuarioRepository.findByEmail(email);
        if (existeUsuario == null) {//no existe el usuario, error de ingreso
            error = true;
        }else {
            // verificar password contra password base datos desencriptada
            if(BCrypt.checkpw(password, existeUsuario.getPassword())) {
                //password iguales, email y password igual a la base datos
                error= false;
            }else {
                //password distintos, error
                error = true;
            }
        }
        return error;
    }

    /*Logica de negocio, o validaciones del sistema*/
    /*LLama al repository y a los metodos*/

}
