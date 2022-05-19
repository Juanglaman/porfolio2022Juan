package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Proyectos;
import com.porfolio.persistenciaJpa.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectosRepository proyRepo;
    
    public ProyectoService(ProyectosRepository proyRepo){
        this.proyRepo = proyRepo;
    }
    
    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void guardarProyecto(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void editarProyecto(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id_pro) {
        proyRepo.deleteById(id_pro);
    }

    @Override
    public Proyectos buscarProyecto(Long id_pro) {
        return proyRepo.findById(id_pro).orElse(null);
    }
    
}
