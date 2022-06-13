package com.porfolio.persistenciaJpa.controller;

import com.porfolio.persistenciaJpa.model.ExpLaboral;
import com.porfolio.persistenciaJpa.service.IExpLaboralService;
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
public class controllerExpLaboral {
    
    @Autowired
    private IExpLaboralService expLaboServ;
    
    @PutMapping ("/api/explaboral/editar/")
    public void editarExpLaboral(@RequestBody ExpLaboral expLabo){
       expLaboServ.editarExpLaboral(expLabo);
    }
    
    @GetMapping ("/api/explaboral/id/{id}")
    @ResponseBody
    public ExpLaboral buscarExpLaboral(@PathVariable Long id){
       return expLaboServ.buscarExpLaboral(id);
    }
    
    @GetMapping( "/api/explaboral/all")
    public ResponseEntity <List<ExpLaboral>> getEducacion(){
        List<ExpLaboral> expLabo = expLaboServ.verExpLaboral();
        return new ResponseEntity<>(expLabo, HttpStatus.OK);
    }
    
    @DeleteMapping ("/api/explaboral/delete/{id_exp}")
    public void borrarExpLaboral(@PathVariable Long id_exp){
        expLaboServ.borrarExpLaboral(id_exp);
    }
    
    @PostMapping ("/api/explaboral/crear")
    public void crearExpLaboral (@RequestBody ExpLaboral expLabo){
        expLaboServ.guardarExpLaboral(expLabo);
    }
}
