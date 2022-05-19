package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.ExpLaboral;
import java.util.List;


public interface IExpLaboralService {
    
    //Traer Lista de Experiencia
    public List<ExpLaboral> verExpLaboral();
    
    //Guardar una Experiencia
    public void guardarExpLaboral(ExpLaboral expLabo);
    //Editar una Experiencia
    public void editarExpLaboral(ExpLaboral expLabo);
    //Eliminar Experiencia
    public void borrarExpLaboral(Long id);
    
    //Buscar Experiencia por id
    public ExpLaboral buscarExpLaboral(Long id);
}
