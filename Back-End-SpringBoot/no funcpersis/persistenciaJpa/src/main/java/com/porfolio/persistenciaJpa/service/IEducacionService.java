package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Educacion;



public interface IEducacionService {
    
    public void agregarEducacion(Educacion edu);
    
    public void actualizarEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public Educacion buscarEducacion(Long id);
}
