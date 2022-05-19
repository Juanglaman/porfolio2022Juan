
package com.porfolio.persistenciaJpa.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion implements Serializable {
    
    @Column (name= "id_edu")
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private Long id_edu;
    
    @Column (name="tituloEdu")
    private String tituloEdu;
    
    @Column (name="anioegreso")
    private String anioegreso;
    
    @Column (name="nombinstituto")
    private String nombinstituto;
    
    @Column (name="descripEdu")
    private String descripEdu;
    
    @Column (name= "id_persona")
    private Long id_persona;
    
    public Educacion(){}
    
    public Educacion( Long iEd, String titEdu, String anioEgre, String nombreInst, String descEdu, Persona i_pers){
        this.id_edu= iEd;
        this.tituloEdu= titEdu;
        this.anioegreso= anioEgre;
        this.nombinstituto= nombreInst;
        this.descripEdu= descEdu;
        this.id_persona= i_pers.getId();
    }
}
