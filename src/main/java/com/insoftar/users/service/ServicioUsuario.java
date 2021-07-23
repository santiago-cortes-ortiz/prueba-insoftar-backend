package com.insoftar.users.service;

import com.insoftar.users.model.Usuario;

import java.util.List;

public interface ServicioUsuario {

    Usuario guardarUsuario(Usuario usuarioNuevo);

    List<Usuario> listarUsuarios();

    Usuario actualizarUsuario(Usuario usuarioModificado);

}
