package com.insoftar.users.service;

import com.insoftar.users.model.Usuario;
import com.insoftar.users.repository.RepositorioUsuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario {

    private final RepositorioUsuario repositorioUsuario;

    public ServicioUsuarioImpl(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @Override
    public Usuario guardarUsuario(Usuario usuarioNuevo) {
        return repositorioUsuario.save(usuarioNuevo);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return repositorioUsuario.findAll();
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuarioModificado) {
        return repositorioUsuario.save(usuarioModificado);
    }
}
