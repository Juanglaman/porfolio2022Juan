
package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Traer Lista de personas
    public List<Persona> verPersona();
    
    //Guardar una persona
    public void guardarPersona(Persona pers);
    
    public void editarPersona(Persona pers);
    //Eliminar persona
    public void borrarPersona(Long id);
    
    //Buscar persona por id
    public Persona buscarPersona(Long id);
    
}
