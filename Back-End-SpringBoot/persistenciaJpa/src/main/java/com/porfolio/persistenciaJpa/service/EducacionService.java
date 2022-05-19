package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Educacion;
import com.porfolio.persistenciaJpa.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService implements IEducacionService{
    
    //private final EducacionRepository eduRepo;
    @Autowired
    public EducacionRepository eduRepo;
    
   
    public EducacionService(EducacionRepository eduRepo){
        this.eduRepo = eduRepo;
    }

    /*@Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll()
    }*/
    @Override
    public List<Educacion> verEducacion(){
        return eduRepo.findAll();
    }

    @Override
    public void addEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void editEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEducacion(Long id_edu) {
        eduRepo.deleteById(id_edu);
    }

    @Override
    public Educacion buscarEducacion(Long id_edu) {
        return eduRepo.findById(id_edu).orElse(null);
    }
    
}