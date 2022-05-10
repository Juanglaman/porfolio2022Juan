
package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersona();
    
    public void editarPersona(Persona pers);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
}
