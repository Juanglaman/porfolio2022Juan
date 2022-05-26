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
    private Long id_pro;
    
    @Column (name= "nombre_pro")
    private String nombre_pro;
    
    @Column (name= "descripcion_pro")
    private String descripcion_pro;
    
    @Column (name= "fecha_inicio_pro")
    private String fecha_inicio_pro;
    
    @Column (name= "fecha_fin_pro")
    private String fecha_fin_pro;
    
    @Column (name= "url_imagen_pro")
    private String url_imagen_pro;
    
    @Column (name= "link_pro")
    private String link_pro;
    
    public Proyectos(){}
    
    public Proyectos( Long ipro, String nomPro, String descPro, String fecInPro, String fecFinPro, String imag, String link){
        this.id_pro= ipro;
        this.nombre_pro= nomPro;
        this.descripcion_pro= descPro;
        this.fecha_inicio_pro= fecInPro;
        this.fecha_fin_pro= fecFinPro;
        this.url_imagen_pro= imag;
        this.link_pro= link;
    }
}
