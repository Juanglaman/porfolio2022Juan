package com.porfolio.persistenciaJpa.repository;

import com.porfolio.persistenciaJpa.model.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiasRepository extends JpaRepository <Tecnologias, Long>{
    
}
