package com.porfolio.persistenciaJpa.controller;

import com.porfolio.persistenciaJpa.model.Tecnologias;
import com.porfolio.persistenciaJpa.service.ITecnologiaService;
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
public class controllerTecnologias {
    
    @Autowired
    private ITecnologiaService tecnoServ;
    
    @PostMapping ("/api/tecnologia/crear")
    public void crearTecnologias (@RequestBody Tecnologias tecno){
        tecnoServ.guardarTecnologias(tecno);
    }
    
    @PutMapping ("/api/tecnologia/editar/")
    public void editarTecnologias(@RequestBody Tecnologias tecno){
       tecnoServ.editarTecnologias(tecno);
    }
    
    @GetMapping ("/api/tecnologia/id/{id_edu}")
    @ResponseBody
    public Tecnologias buscarTecnologias(@PathVariable Long id_tec){
       return tecnoServ.buscarTecnologias(id_tec);
    }
    
    @GetMapping( "/api/tecnologia/all")
    public List<Tecnologias> verTecnologias(){
        return tecnoServ.verTecnologias();
    }
    
    @DeleteMapping ("/api/tecnologia/delete/{id}")
    public void borrarTecnologias(@PathVariable Long id_tec){
        tecnoServ.borrarTecnologias(id_tec);
    }
}
