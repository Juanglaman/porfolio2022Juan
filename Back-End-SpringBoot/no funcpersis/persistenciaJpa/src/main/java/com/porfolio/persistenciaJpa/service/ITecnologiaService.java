package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Tecnologias;



public interface ITecnologiaService {
    
    public void agregarTecnologia(Tecnologias tecno);
    
    public void actualizarTecnologia(Tecnologias tecno);
    
    public void borrarTecnologia(Long id);
    
    public Tecnologias buscarTecnologia(Long id);
}
