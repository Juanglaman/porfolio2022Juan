package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Tecnologias;
import com.porfolio.persistenciaJpa.repository.TecnologiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TecnologiaService implements ITecnologiaService{
    
    @Autowired
    public TecnologiasRepository tecnoRepo;
    
    public TecnologiaService(TecnologiasRepository tecnoRepo){
        this.tecnoRepo = tecnoRepo;
    }
    
    @Override
    public List<Tecnologias> verTecnologias() {
        return tecnoRepo.findAll();
    }

    @Override
    public void guardarTecnologias(Tecnologias tecno) {
        tecnoRepo.save(tecno);
    }

    @Override
    public void editarTecnologias(Tecnologias tecno) {
        tecnoRepo.save(tecno);
    }

    @Override
    public void borrarTecnologias(Long id_tec) {
        tecnoRepo.deleteById(id_tec);
    }

    @Override
    public Tecnologias buscarTecnologias(Long id_tec) {
        return tecnoRepo.findById(id_tec).orElse(null);
    }
    
}
