
package com.porfolio.persistenciaJpa.controller;

import com.porfolio.persistenciaJpa.model.Educacion;
import com.porfolio.persistenciaJpa.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping( "/educacion/")
public class ControllerEducacion {
    
   
    private IEducacionService eduServ;
    
    @PutMapping ("/actualizar/")
    public void editarEducacion(@RequestBody Educacion edu){
       eduServ.actualizarEducacion(edu);
    }
    
    /*@GetMapping ("{id}")
    @ResponseBody
    public List<Educacion> buscarEducacion(@PathVariable Long id){
       return (List<Educacion>) eduServ.buscarEducacion(id);
    }*/
    @GetMapping ("/id/{id}")
    @ResponseBody
    public Educacion buscarPersona(@PathVariable Long id){
       return eduServ.buscarEducacion(id);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
}
