
package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Usuario;


public interface IUsuarioService {
    
    public Usuario buscarUsuario(String correo, String password);
}
