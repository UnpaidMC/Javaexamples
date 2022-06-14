package com.generation.api;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var")
public class PathVariableRestController {

    //Capturar variables desde la ruta o path
    //localhost:8080/var/anio/2022/mes/06/dia/13
    //SECCIONAR
    @RequestMapping("/anio/{anio}/{mes}/{dia}")
    public String capturarVariablesPath(@PathVariable("anio") String anio,
                                        @PathVariable("mes") String mes,
                                        @PathVariable("dia") String dia){

    return "El año es "+ anio +", el mes es " + mes +" y el dia es "+dia;

    }



}
