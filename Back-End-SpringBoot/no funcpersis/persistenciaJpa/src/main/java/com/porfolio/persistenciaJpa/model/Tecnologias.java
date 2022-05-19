package com.porfolio.persistenciaJpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table (name= "tecnologias")
@Getter @Setter
public class Tecnologias {
    
    @Id
    @Column(name= "idTec")
    @GeneratedValue (strategy= GenerationType.AUTO)
    private Long idTec;
    
    @Column (name= "nombreTec")
    private String nombreTec;
    
    @Column( name= "porcentaje")
    private int porcentaje;
    
    public Tecnologias(){}
    
    public Tecnologias( Long iTec, String nomTec, int porcen){
        this.idTec= iTec;
        this.nombreTec= nomTec;
        this.porcentaje= porcen;
    }
}
