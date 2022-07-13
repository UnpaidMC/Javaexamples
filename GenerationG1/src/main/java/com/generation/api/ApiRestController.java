package com.generation.api;

import com.generation.models.Auto;
import com.generation.services.registroAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//API IMPORTA .json (Javascrip object notation)
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ApiRestController {

    @Autowired //Inyeccion de dependencias, traer una clase para ser usada internamente
    registroAutoService autoService;

    @RequestMapping("/obtener/auto")
    public List<Auto> obtenerListaAutos(){

        List<Auto> listaAutos = autoService.findAll();
        return listaAutos;



    }


}
