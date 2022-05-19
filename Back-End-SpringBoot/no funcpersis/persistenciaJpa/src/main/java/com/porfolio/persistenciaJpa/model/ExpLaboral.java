
package com.porfolio.persistenciaJpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import com.porfolio.persistenciaJpa.model.Persona;

@Table (name = "explaboral")
@Entity
@Getter @Setter
public class ExpLaboral {
    
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id_exp;
    
    @Column (name= "nombre_empresa")
    private String nombre_empresa;
    
    @Column (name= " trabajoAct")
    private Boolean trabajoAct;
    
    @Column (name= "fecha_inicio")
    private String fecha_inicio;
    
    @Column (name= "fecha_fin")
    private String fecha_fin;
    
    @Column (name= "descripcion")
    private String descripcion;
    
    @Column (name= "puesto")
    private String puesto;
    
    @Column (name= "url_logo_empresa")
    private String url_logo_empresa;
    
    @Column (name= "id_persona")
    private Long id_persona;
    
    public ExpLaboral(){}
    
    public ExpLaboral( Long i, String nom, Boolean tact, String fecInici, String fefin, String des, String pues, String imgEmp, Persona i_pers){
        this.id_exp= i;
        this.nombre_empresa= nom;
        this.trabajoAct= tact;
        this.fecha_inicio= fecInici;
        this.fecha_fin= fefin;
        this.descripcion= des;
        this.puesto= pues;
        this.url_logo_empresa= imgEmp;
        this.id_persona= i_pers.getId();
    }
}
