
package com.porfolio.persistenciaJpa.service;

import com.porfolio.persistenciaJpa.model.Usuario;
import com.porfolio.persistenciaJpa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository userRepo;

    @Override
    public Usuario buscarUsuario(String correo, String password) {
        return userRepo.findByCorreoAndPassword(correo, password);
    }
}
