package com.porfolio.persistenciaJpa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private String fecha_nacimiento;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private String url_foto_perfil;
    private String url_foto_baner;
    
    /*@OneToMany (fetch = FetchType.LAZY, mappedBy= "id_persona")
    private List<ExpLaboral> expList;
    */
    /*@OneToMany (fetch = FetchType.LAZY, mappedBy= "id_persona")
    private List<Educacion> eduList;
    
    @OneToMany (fetch = FetchType.LAZY, mappedBy= "id_persona")
    private List<Proyectos> proList;
    
    @OneToMany (fetch = FetchType.LAZY, mappedBy= "id_persona")
    private List<Tecnologias> tecList;*/

    public Persona(){}
    
    public Persona(Long num, String nom, String ape, String domi, String fecha, String tel, String mail, String sob, String foto_per, String foto_ban){
        this.id = num;
        this.nombre = nom;
        this.apellido = ape;
        this.domicilio = domi;
        this.fecha_nacimiento = fecha;
        this.telefono = tel;
        this.correo = mail;
        this.sobre_mi = sob;
        this.url_foto_perfil = foto_per;
        this.url_foto_baner = foto_ban;
    }
}
