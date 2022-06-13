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
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long idTec;
    
    @Column (name= "nombreTec")
    private String nombreTec;
    
    @Column( name= "porcentaje")
    private int porcentaje;
    
    @Column (name= "url_imagen_tec")
    private String url_imagen_tec;
    
    public Tecnologias(){}
    
    public Tecnologias( Long iTec, String nomTec, int porcen, String url_imagen){
        this.idTec= iTec;
        this.nombreTec= nomTec;
        this.porcentaje= porcen;
        this.url_imagen_tec= url_imagen;
    }
    
    public String getUrl_imagen_tec(){
        return url_imagen_tec;
    }
    public void setUrl_imgen_tec(String url_imagen){
        this.url_imagen_tec = url_imagen;
    }
}
