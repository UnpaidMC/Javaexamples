package com.generation.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
@RequestMapping("/registro")
public class RegistroController {

    @RequestMapping("")
    public String registro(){

        return "registro.jsp";
    }

    @RequestMapping("/usuario")
    public String registroUsuario(@RequestParam(value = "nombre") String nombre,
                                  @RequestParam(value = "apellido") String apellido,
                                  @RequestParam(value = "edad") String edad){
        System.out.println("Su nombre es "+ nombre);
        System.out.println("Su apellido es "+ apellido);
        System.out.println("Su edad es "+ edad);

        return "registro.jsp";
    }
}
