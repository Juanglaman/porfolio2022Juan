package com.porfolio.persistenciaJpa.controller;

import com.porfolio.persistenciaJpa.model.Persona;
import com.porfolio.persistenciaJpa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controllerPersona {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PutMapping ("/api/persona/editar/")
    public void editarPersona(@RequestBody Persona pers){
       persoServ.editarPersona(pers);
    }
    
    @GetMapping ("/api/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id){
       return persoServ.buscarPersona(id);
    }
    
    @DeleteMapping ("/api/persona/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
}
