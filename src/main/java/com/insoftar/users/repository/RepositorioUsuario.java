package com.insoftar.users.repository;

import com.insoftar.users.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario,Long> {
}
