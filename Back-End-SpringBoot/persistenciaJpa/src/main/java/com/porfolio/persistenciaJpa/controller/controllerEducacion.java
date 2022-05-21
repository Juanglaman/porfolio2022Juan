package com.porfolio.persistenciaJpa.controller;

import com.porfolio.persistenciaJpa.model.Educacion;
import com.porfolio.persistenciaJpa.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerEducacion {
    
    @Autowired
    private IEducacionService eduServ;
    
    @PutMapping ("/api/educacion/editar/")
    public void editEducacion(@RequestBody Educacion edu){
       eduServ.editEducacion(edu);
    }
    
    @GetMapping ("/api/educacion/id/{id_edu}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Long id_edu){
       return eduServ.buscarEducacion(id_edu);
    }
    
    @GetMapping( "/api/educacion/all")
    public ResponseEntity <List<Educacion>> getEducacion(){
        List<Educacion> edu = eduServ.verEducacion();
        return new ResponseEntity<>(edu, HttpStatus.OK);
    }
    
    @DeleteMapping ("/api/educacion/borrar/{id_edu}")
    public void deleteEducacion(@PathVariable Long id_edu){
        eduServ.deleteEducacion(id_edu);
    }
    
    @PostMapping ("/api/educacion/crear")
    public void addEducacion (@RequestBody Educacion edu){
        eduServ.addEducacion(edu);
    }
}
