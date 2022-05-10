package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Educacion;
import com.porfolio.persistenciaJpa.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
    private final EducacionRepository eduRepo;
    
    @Autowired
    public EducacionService(EducacionRepository eduRepo){
        this.eduRepo = eduRepo;
    }
    
    public Educacion agregarEducacion( Educacion educacion){
        return eduRepo.save(educacion);
    }
    
    public List buscarEducacion( Educacion educacion){
        return eduRepo.findAll();
    }
    
    public Educacion editarEducacion( Educacion educacion){
        return eduRepo.save(educacion);
    }
    
    public void borrarEducacion( Long id){
        eduRepo.deleteById(id);
    }
}
