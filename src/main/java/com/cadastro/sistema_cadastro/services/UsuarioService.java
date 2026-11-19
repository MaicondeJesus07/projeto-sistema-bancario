
package com.cadastro.sistema_cadastro.services;

import com.cadastro.sistema_cadastro.model.Usuario;
import com.cadastro.sistema_cadastro.repository.UsuarioRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

// Classe responsável pelas regras de negócio dos usuários.
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    // Injeção das dependências necessárias para o serviço.
    public UsuarioService(
            UsuarioRepository usuarioRepository,
            PasswordEncoder passwordEncoder) {

        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Método responsável por cadastrar um usuário.
    public Usuario salvar(Usuario usuario) {

        // Recupera a senha original informada no cadastro.
        String senhaOriginal = usuario.getSenha();

        // Gera o hash da senha utilizando BCrypt.
        String senhaCriptografada =
                passwordEncoder.encode(senhaOriginal);

        // Substitui a senha original pelo hash.
        usuario.setSenha(senhaCriptografada);

        // Salva o usuário com a senha protegida no banco.
        return usuarioRepository.save(usuario);
    }

    // Método responsável por listar os usuários cadastrados.
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }
}



