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
@Table (name= "proyectos")
@Getter @Setter
public class Proyectos {
    
    @Id
    @Column (name= "idPro")
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long idPro;
    
    @Column (name= "nombrePro")
    private String nombrePro;
    
    @Column (name= "descripcionPro")
    private String descripcionPro;
    
    @Column (name= "fechaInicioPro")
    private String fechaInicioPro;
    
    @Column (name= "fechaFinPro")
    private String fechaFinPro;
    
    @Column (name= "urlImagenPro")
    private String urlImgenPro;
    
    @Column (name= "linkPro")
    private String linkPro;
    
    @Column (name= "id_persona")
    private Long id_persona;
    
    public Proyectos(){}
    
    public Proyectos( Long ipro, String nomPro, String descPro, String fecInPro, String fecFinPro, String imag, String link, Persona i_pers){
        this.idPro= ipro;
        this.nombrePro= nomPro;
        this.descripcionPro= descPro;
        this.fechaInicioPro= fecInPro;
        this.fechaFinPro= fecFinPro;
        this.urlImgenPro= imag;
        this.linkPro= link;
        this.id_persona= i_pers.getId();
    }
}
