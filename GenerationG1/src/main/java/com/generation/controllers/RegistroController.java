package com.generation.controllers;


import com.generation.models.Usuario;
import com.generation.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller()
@RequestMapping("/registro")
public class RegistroController {

//Inyeccion de dependencias
    @Autowired
    UsuarioService usuarioService;


    @RequestMapping ("")
    public String registro(@ModelAttribute("usuario") Usuario usuario){//Objeto Usuario esta vacio

        return "registro.jsp";
    }

    @RequestMapping("/usuario/respaldo")
    public String registroUsuario(@RequestParam(value = "nombre") String nombre,
                                  @RequestParam(value = "apellido") String apellido,
                                  @RequestParam(value = "edad") String edad){
        System.out.println("Su nombre es "+ nombre);
        System.out.println("Su apellido es "+ apellido);
        System.out.println("Su edad es "+ edad);

        return "registro.jsp";
    }

    @PostMapping ("/usuario")
    public String capturaUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, //Objeto Usuario esta vacio
                                 BindingResult resultado,
                                 Model model){

        if(resultado.hasErrors()){//Validar si resultado tiene errores
           model.addAttribute("msgError", "Uno de los datos esta erroneo, porfavor arreglar");

            return "registro.jsp";

        }else{

            //enviar el objeto al service
            boolean usuarioCreado= usuarioService.saveUsuario(usuario);
        //@Valid valida resulatos junto con BindingResult
        //enviar el objeto al service
            if(usuarioCreado) {
                model.addAttribute("msgError", "El email ya esta registrado");
                return "registro.jsp";
            }else {
                return "login.jsp";
            }
    }
    }

    @RequestMapping("/usuario/ingreso")
    public String ingresoUsuario(@RequestParam(value="email") String email,
                                 @RequestParam(value="password") String password,
                                 Model model, HttpSession session) {
        /*validaciones a realizar*/
        //validar que los parametros no son null o vacios
        if(email==null || password ==null ||  email.isEmpty() || password.isEmpty()) {
            model.addAttribute("msgError", "Todos los campos son obligatorios");
            return "login.jsp";
        }
        //si es true, indica que hay un error el bd
        boolean usuarioValidado = usuarioService.validarUsuario(email,password);

        if(usuarioValidado){
            model.addAttribute("msgError", "Error en el ingreso al sistema");
            return "login.jsp";
        }else {
            //no hay error, puede ingresar al sistema
            session.setAttribute("email", email);

            return "redirect:/home";
        }
    }

    @RequestMapping("/usuario/login")
    public String login() {
        return "login.jsp";
    }
}
