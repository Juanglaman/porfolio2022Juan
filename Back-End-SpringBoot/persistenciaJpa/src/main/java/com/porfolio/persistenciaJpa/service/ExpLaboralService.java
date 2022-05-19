package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.ExpLaboral;
import com.porfolio.persistenciaJpa.repository.ExplaboRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExpLaboralService implements IExpLaboralService{

    @Autowired
    public ExplaboRepository expoRepo;
    
    public ExpLaboralService(ExplaboRepository expoRepo){
        this.expoRepo = expoRepo;
    }
    
    @Override
    public List<ExpLaboral> verExpLaboral() {
        return expoRepo.findAll();
    }

    @Override
    public void guardarExpLaboral(ExpLaboral expLabo) {
        expoRepo.save(expLabo);
    }

    @Override
    public void editarExpLaboral(ExpLaboral expLabo) {
        expoRepo.save(expLabo);
    }

    @Override
    public void borrarExpLaboral(Long id) {
        expoRepo.deleteById(id);
    }

    @Override
    public ExpLaboral buscarExpLaboral(Long id) {
        return expoRepo.findById(id).orElse(null);
    }
    
}
