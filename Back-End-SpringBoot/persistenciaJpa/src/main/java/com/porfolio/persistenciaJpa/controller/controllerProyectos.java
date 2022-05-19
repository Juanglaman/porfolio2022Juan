package com.porfolio.persistenciaJpa.controller;

import com.porfolio.persistenciaJpa.model.Proyectos;
import com.porfolio.persistenciaJpa.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controllerProyectos {
    
    @Autowired
    private IProyectoService proyServ;
    
    @PostMapping ("/api/proyectos/crear")
    public void crearProyecto (@RequestBody Proyectos proy){
        proyServ.guardarProyecto(proy);
    }
    
    @PutMapping ("/api/proyectos/editar/")
    public void editarProyecto(@RequestBody Proyectos proy){
       proyServ.editarProyecto(proy);
    }
    
    @GetMapping ("/api/proyectos/id/{id_edu}")
    @ResponseBody
    public Proyectos buscarProyecto(@PathVariable Long id_pro){
       return proyServ.buscarProyecto(id_pro);
    }
    
    @GetMapping( "/api/proyectos/all")
    public List<Proyectos> verProyectos(){
        return proyServ.verProyectos();
    }
    
    @DeleteMapping ("/api/proyectos/delete/{id}")
    public void borrarProyecto(@PathVariable Long id_pro){
        proyServ.borrarProyecto(id_pro);
    }
}
