package com.generation.controllers;


import com.generation.models.Usuario;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //ESTABLECEMOS RUTA CONTROLADOR
public class IndexController {
    @RequestMapping("/home") //ANOTACION PARA CAPTURAR LAS RUTAS
    public String index(@NotNull Model model) {
        /*model.addAttribute("apellidos", "Roldan");
        model.addAttribute("nombres", "Michael");
        model.addAttribute("edad", "28");*/

        return "home.jsp";
    }



}

