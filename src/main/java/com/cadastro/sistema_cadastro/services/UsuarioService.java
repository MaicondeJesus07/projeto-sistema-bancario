package com.cadastro.sistema_cadastro.services;

import com.cadastro.sistema_cadastro.model.Usuario;
import com.cadastro.sistema_cadastro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

private final UsuarioRepository usuarioRepository; //ISTANCIA DE USUARIOREPOSITORIO NO SERVIÇO DE USUARIO (DEPENDENCIA)

public UsuarioService(UsuarioRepository usuarioRepository){
    this.usuarioRepository= usuarioRepository;
     }

 //METODO DE SALVAR USUARIO////////////
 public Usuario Salvar(Usuario usuario){
    return usuarioRepository.save(usuario);
 }
}
