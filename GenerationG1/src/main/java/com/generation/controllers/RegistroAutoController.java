package com.generation.controllers;

import com.generation.models.Auto;

import com.generation.services.registroAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller()

public class RegistroAutoController {

    //Inyeccion de dependencias
    @Autowired
    registroAutoService autoService;

    @RequestMapping("/registroAuto")
    public String registro(@ModelAttribute("auto") Auto auto){//Objeto Usuario esta vacio

        return "registroAuto.jsp";
    }



    @RequestMapping("/registroAuto/mostrar")
    public String mostrarroauto(Model model){


        //Solo mostrar autos mandandole el listado al .jsp
        List<Auto> listaAutos = autoService.findAll();
        model.addAttribute("ListaAutos", listaAutos);

        return "mostrarautos.jsp";
    }




    @PostMapping("/registroAuto/completo")
    public String capturaRegistro(@Valid @ModelAttribute("auto") Auto auto, //Objeto Usuario esta vacio
                                 BindingResult resultado,
                                 Model model) {

        if (resultado.hasErrors()) {//Validar si resultado tiene errores
            model.addAttribute("msgError", "Uno de los datos esta erroneo, porfavor arreglar");

            return "registroAuto.jsp";

        } else {

            autoService.saveRegistro(auto);
            List<Auto> listaAutos = autoService.findAll();
            model.addAttribute("ListaAutos", listaAutos);
            return "mostrarautos.jsp";


        }
    }
    @RequestMapping("/registroAuto/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        System.out.println("el id es: "+id);
        Auto auto = autoService.buscarId(id);
        model.addAttribute("auto", auto);
        return "editarAuto.jsp";

    }

    //Para actualizar la BBDD
    @PostMapping("registroAuto/actualizar/{id}")
    public String actualizarRegistro(@PathVariable("id") Long id, @Valid @ModelAttribute("auto") Auto auto, //Objeto Usuario esta vacio
                                  BindingResult resultado,
                                  Model model) {

        if (resultado.hasErrors()) {//Validar si resultado tiene errores
            model.addAttribute("msgError", "Uno de los datos esta erroneo, porfavor arreglar");

            return "editarAuto.jsp";

        } else {

            auto.setId(id); //Agregamos id al objeto, en este caso auto de la clase Auto
            autoService.saveRegistro(auto);
            List<Auto> listaAutos = autoService.findAll();
            model.addAttribute("ListaAutos", listaAutos);
            return "mostrarautos.jsp";


        }
    }

    @RequestMapping("/registroAuto/eliminar/{id}")
    public String eliminarAuto(@PathVariable("id") Long id){

        autoService.eliminarAuto(id);

        return "redirect:/registroAuto/mostrar"; //redirect manda a la ruta asociada
    }


    /*Para la edicion:
    * 1. Capturar id
    * 2. Buscar el objeto completo a la BD
    * 3. Pasar el objeto completo al .jsp
    * 4. Mostar los datos en el .jsp
    * 5. Modificar un dato menos el ID
    * 6. Pasar el objeto modificado al controlador
    * 7. En la nueva ruta(controlador), capturar el objeto
    * 8. Actualizar el objeto en la base de datos
    *
    * */



}
