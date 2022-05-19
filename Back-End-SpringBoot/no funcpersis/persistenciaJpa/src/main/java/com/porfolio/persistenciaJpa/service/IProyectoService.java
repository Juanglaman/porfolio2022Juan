package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Proyectos;



public interface IProyectoService {
    
    public void agregarProyecto(Proyectos proy);
    
    public void actualizarProyectos(Proyectos proy);
    
    public void borrarProyectos(Long id);
    
    public Proyectos buscarProyectos(Long id);
}
