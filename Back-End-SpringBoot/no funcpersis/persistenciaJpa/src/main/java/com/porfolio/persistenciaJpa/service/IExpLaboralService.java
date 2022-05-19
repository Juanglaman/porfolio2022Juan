package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.ExpLaboral;


public interface IExpLaboralService {
    
    public void agregarExpLaboral(ExpLaboral expoLabo);
    
    public void actualizarExpLaboral(ExpLaboral expoLabo);
    
    public void borrarExpLaboral(Long id);
    
    public ExpLaboral buscarExpLaboral(Long id);
}
