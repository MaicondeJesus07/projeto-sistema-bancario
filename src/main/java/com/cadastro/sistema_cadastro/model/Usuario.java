package com.cadastro.sistema_cadastro.model;


import jakarta.persistence.*;

@Entity ///REPRESENTAÇAO DE USUARIOS//
@Table (name = "Usuarios") ///DEFINE NOME DA TABELA//

public class Usuario {
    @Id //IDENTIFICAÇAO DE  USUARIO//
    @GeneratedValue(strategy = GenerationType.IDENTITY) ///GERA BANCO AUTOMÁTICAMENTE

    private long id;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String idade;
    private String nommePai;
    private String nomeMae;
    private String CPF;
    private String telefone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNommePai() {
        return nommePai;
    }

    public void setNommePai(String nommePai) {
        this.nommePai = nommePai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
