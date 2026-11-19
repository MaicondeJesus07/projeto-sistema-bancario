
package com.cadastro.sistema_cadastro.controller;

import com.cadastro.sistema_cadastro.DTO.UsuarioRespostaDTO;
import com.cadastro.sistema_cadastro.model.Usuario;
import com.cadastro.sistema_cadastro.services.UsuarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")

@RestController ///indica a classe que atende as requisições enviadas pelo POSTMAN para serem tratadas como JSON


public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuarios") ///Associação de requisições HTTP post ao caminho "usuarios"

    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
        ///Instrui o spring a converter o corpo da requisição, em JSON para um objeto "Usuario"
    }

    @GetMapping("/usuarios") ///Definição ao endereço que recebe requisições GET

    public List<UsuarioRespostaDTO> listarTodos() {
        return usuarioService.listarTodos()
                .stream()///Inicia o processamento dos usúarios da lista
                .map(usuario -> new UsuarioRespostaDTO(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getEmail()
                ))///Aqui transforma o objeto "Usuario" em resposta ao UsuarioRespostaDTO, contendo; id,nome e email
                .toList();///Reúne as resposta em uma nova lista


    }
}



