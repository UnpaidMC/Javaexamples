package com.generation.controllers;


import com.generation.models.Auto;
import com.generation.models.Dinosaurio;
import com.generation.repositories.DinosaurioRepository;
import com.generation.services.DinosaurioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller

public class DinosaurioController {

    @Autowired
    DinosaurioService dinosaurioService;

    @RequestMapping("/registroDinosaurio")
    public String registroDinosaurio(@ModelAttribute("dinosaurio") Dinosaurio dinosaurio){

        return "registroDinosaurio.jsp";
    }


    @RequestMapping("/registroDinosaurio/mostrar")
    public String mostrarDinosaurio(@ModelAttribute("dinosaurio") Dinosaurio dinosaurio){

        return "mostrarDinosaurio.jsp";
    }

    @PostMapping("/registroDinosaurio/completo")
    public String capturarDinosaurio(@Valid @ModelAttribute("dinosaurio") Dinosaurio dinosaurio,
                                     BindingResult resultado, Model model){

        if (resultado.hasErrors()) {//Validar si resultado tiene errores
            model.addAttribute("msgError", "Uno de los datos esta erroneo, porfavor arreglar");
            return "registroDinosaurio.jsp";
        }else{

            dinosaurioService.guardarRegistro(dinosaurio);
            List<Dinosaurio> ListaDinosaurio = dinosaurioService.findAll();
            model.addAttribute("ListaDinosaurio", ListaDinosaurio);
        return "mostrarDinosaurio.jsp";
    }
    }

}
