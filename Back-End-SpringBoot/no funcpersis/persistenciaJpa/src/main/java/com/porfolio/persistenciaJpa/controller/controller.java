
package com.porfolio.persistenciaJpa.controller;

import com.porfolio.persistenciaJpa.model.Persona;
import com.porfolio.persistenciaJpa.model.Usuario;
import com.porfolio.persistenciaJpa.service.IPersonaService;
import com.porfolio.persistenciaJpa.service.IUsuarioService;
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
public class controller {
    
    @Autowired
    private IPersonaService persoServ;
    @Autowired
    private IUsuarioService userServ;
    
    @PostMapping ("/api/login/")
    @ResponseBody
    public Usuario login(@RequestBody Usuario u){
        return userServ.buscarUsuario(u.getCorreo(), u.getPassword());
       
    }
    
    @PutMapping ("/api/editar/")
    public void editarPersona(@RequestBody Persona pers){
       persoServ.editarPersona(pers);
    }
    
    @PostMapping ("/api/inicio/")
    @ResponseBody
    public Persona buscarPersona(@RequestBody Persona pers){
       return persoServ.buscarPersona(pers.getId());
    }
    
    @DeleteMapping ("/api/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
}
