
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
@Getter @Setter
@Table (name= "educacion")
public class Educacion {
    
    @Column (name= "idEdu")
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO)
    private Long idEdu;
    
    @Column (name="tituloEdu")
    private String tituloEdu;
    
    @Column (name="anioegreso")
    private String anioegreso;
    
    @Column (name="nombinstituto")
    private String nombinstituto;
    
    @Column (name="descripEdu")
    private String descripEdu;
    
    public Educacion(){}
    
    public Educacion( Long iEd, String titEdu, String anioEgre, String nombreInst, String descEdu){
        this.idEdu= iEd;
        this.tituloEdu= titEdu;
        this.anioegreso= anioEgre;
        this.nombinstituto= nombreInst;
        this.descripEdu= descEdu;
    }
}
