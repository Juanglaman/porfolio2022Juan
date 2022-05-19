package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Tecnologias;
import java.util.List;




public interface ITecnologiaService {
    
    //Traer Lista de Tecnologias
    public List<Tecnologias> verTecnologias();
    
    //Guardar una Tecnologia
    public void guardarTecnologias(Tecnologias tecno);
    
    //Editar una Tecnologia
    public void editarTecnologias(Tecnologias tecno);
    
    //Eliminar Tecnologia
    public void borrarTecnologias(Long id_tec);
    
    //Buscar Tecnologia por id
    public Tecnologias buscarTecnologias(Long id_tec);
}
