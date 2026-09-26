package com.cadastro.sistema_cadastro.repository;

import com.cadastro.sistema_cadastro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

///OBS:ESTA PASTA CRIA OPERAÇÕES DE BANCO PARA ENTIDADES ONDE O "ID" É "LONG"

public interface
UsuarioRepository extends JpaRepository<Usuario,Long> {
}
