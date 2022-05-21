
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
    
    @Column (name="titulo_edu")
    private String titulo_edu;
    
    @Column (name="anioegreso")
    private String anioegreso;
    
    @Column (name="nombinstituto")
    private String nombinstituto;
    
    @Column (name="descrip_edu")
    private String descrip_edu;
    
    public Educacion(){}
    
    public Educacion( Long iEd, String titEdu, String anioEgre, String nombreInst, String descEdu){
        this.id_edu= iEd;
        this.titulo_edu= titEdu;
        this.anioegreso= anioEgre;
        this.nombinstituto= nombreInst;
        this.descrip_edu= descEdu;
    }
}
