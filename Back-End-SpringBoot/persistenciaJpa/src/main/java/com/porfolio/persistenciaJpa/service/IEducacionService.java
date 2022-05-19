package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    //Traer Lista de educacion
    public List<Educacion> verEducacion();
    
    //Guardar una educacion
    public void addEducacion(Educacion edu);
   
    //Editar una educacion
    public void editEducacion(Educacion edu);
   
    //Eliminar educacion
    public void deleteEducacion(Long id_edu);
    
    //Buscar educacion por id
    public Educacion buscarEducacion(Long id_edu);
}
