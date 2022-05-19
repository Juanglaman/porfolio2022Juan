package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Proyectos;
import java.util.List;


public interface IProyectoService {
    
    //Traer Lista de proyectos
    public List<Proyectos> verProyectos();
    
    //Guardar un proyecto
    public void guardarProyecto(Proyectos proy);
    
    //Editar un proyecto
    public void editarProyecto(Proyectos proy);
    
    //Eliminar proyecto
    public void borrarProyecto(Long id_pro);
    
    //Buscar proyecto por id
    public Proyectos buscarProyecto(Long id_pro);
}
