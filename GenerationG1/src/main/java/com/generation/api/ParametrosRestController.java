package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class ParametrosRestController {

    //FORMULARIOS
    //localhost:8080/api?fecha=20220613
    @RequestMapping("/")
    public String fecha (@RequestParam(value = "fecha") String fecha){
      return "la fecha es "+ fecha;
    }
    //localhost:8080/api/seccion?modulo=3&seccion=5
    //El url debe contener los 2 parametros
    //El ? despues de seccion significa que deben haber parametros
    @RequestMapping("/seccion")
    public String seccion (@RequestParam(value = "modulo") String modulo,
          @RequestParam(value = "seccion") String seccion) {
        return "El modulo es "+ modulo +" y la seccion es "+ seccion;
    }

    //URL CON PARAMETROS NO OBLIGATORIOS
    //localhost:8080/api/date?anio=2022&mes=06&dia=13
    @RequestMapping("/date")
    public String date (@RequestParam(value = "anio", required = false) String anio,
                           @RequestParam(value = "mes", required = false) String mes,
                           @RequestParam(value = "dia", required = false) String dia){
        return "Hoy es el " + dia + " del " + mes + " del año " + anio ;
    }


}
