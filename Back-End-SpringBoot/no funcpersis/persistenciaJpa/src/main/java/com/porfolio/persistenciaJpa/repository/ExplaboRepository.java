
package com.porfolio.persistenciaJpa.repository;

import com.porfolio.persistenciaJpa.model.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExplaboRepository extends JpaRepository <ExpLaboral, Long>{
    
}
