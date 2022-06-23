package com.generation.controllers;


import com.generation.models.Licencia;
import com.generation.models.Usuario;
import com.generation.services.LicenciaService;
import com.generation.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/licencia")
public class LicenciaController {
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    LicenciaService licenciaService;


    @RequestMapping("")
    public String muestraPagina(Model model){
        Licencia licencia = new Licencia();
        //licencia.setEstado("activo");
        model.addAttribute("licencia", licencia);
        List<Usuario> listaUsuario = usuarioService.findAll();
        model.addAttribute("listaUsuario", listaUsuario);

        return "licencia.jsp";
    }

    @RequestMapping("/mostrar")
    public String mostrarpagina(Model model){

        List<Licencia> listaLicencia = licenciaService.findAll();
        model.addAttribute("listaLicencia", listaLicencia);


        Date fechaActual= new Date();

        return "mostrarlicencia.jsp";

    }


    @PostMapping("/guardar")
    public String guardarLicencia(@Valid @ModelAttribute("licencia") Licencia licencia, Model model){

        licenciaService.save(licencia);
        List<Licencia> listaLicencia = licenciaService.findAll();
        model.addAttribute("listaLicencia", listaLicencia);

        return "mostrarlicencia.jsp";
    }


}
