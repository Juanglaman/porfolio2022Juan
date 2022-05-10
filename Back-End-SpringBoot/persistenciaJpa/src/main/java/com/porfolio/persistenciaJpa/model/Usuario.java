
package com.porfolio.persistenciaJpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Table(name="usuario")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")
    private Long id;
    @Column (name= "nombre")
    private String nombre;
    @Column (name= "correo")
    private String correo;
    @Column (name= "password")
    private String password;
    
}
