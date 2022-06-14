package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //ESTABLECEMOS RUTA CONTROLADOR
public class EnrutamientoRestController {

    /*public class IndexController{
    //http://localhost:8080/
    @RequestMapping("/") //ANOTACION PARA CAPTURAR LAS RUTAS
    public String index() {
        return "hola mundo G1";
    }*/


    /*Enrutamientos*/

    //http://locahost:8080/usuario
    @RequestMapping("/usuario")
    public String usuario(){
        return "estamos en la url usuario";

    }

    @RequestMapping("/usuario/inscrito")
    public String inscrito(){
        return "estamos en la url usuario/inscrito";

    }
    @RequestMapping("/cliente/registrado")
    public String cliente(){
        return "estamos en la url de clientes registrados";

    }
    @RequestMapping(value = "/proveedor/registrado", method= RequestMethod.GET)
    public String proveedor(){
        return "estamos en la url de proveedores registrados";

    }
}

