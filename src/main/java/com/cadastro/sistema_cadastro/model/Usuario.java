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
    private String nomePai;
    private String nomeMae;
    private String CPF;
    private String telefone;

    ///GETTERS E SETTERS DE INFORMAÇÕES DO USUARIOS/////////////


    public long getId() {
        return id;
    } //GETTERS DE IDENTIFICAÇÃO DE USUARIO
    public void setId(long id) {
        this.id = id;
    } //SETTER DE IDENTIFICAÇÃO DE USUARIO




    public String getEmail() {
        return email;
    } //GETTER DE EMAIL DO USUARIO

    public void setEmail(String email) {
        this.email = email;
    } //SETTER DE EMAIL DO USUARIO




    public String getEndereco() {
        return endereco;
    } //GETTER DE ENDEREÇO DO USUARIO

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } //SETTER DE ENDEREÇO DO USUARIO




    public String getSenha() {
        return senha;
    } //GETTER DE SENHA DO USUARIO

    public void setSenha(String senha) {
        this.senha = senha;
    } //SETTER DE SENHA DO USUARIO




    public String getNomePai() {
        return nomePai;
    } //GETTER DO NOME DO DO PAI DO USUARIO

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }//SETTER DO NOME PAI DO USUARIO




    public String getNome() {
        return nome;
    } //GETTER DO NOME DE USUARIO

    public void setNome(String nome) {
        this.nome = nome;
    }//SETTER DO NOME DO USUARIO




    public String getIdade() {
        return idade;
    }//GETTER DE IDADE DO USUARIO

    public void setIdade(String idade) {
        this.idade = idade;
    }//SETTER DE IDADE DO USUARIO




    public String getNomeMae() {
        return nomeMae;
    } //GETTER DO NOME DA MÃE

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }//SETTER NOME DA MÃE DO USUARIO




    public String getCPF() {
        return CPF;
    }//GETTER DE CPF DO USUARIO

    public void setCPF(String CPF) {
        this.CPF = CPF;//SETTER DE CPF DO USUARIO
    }




    public String getTelefone() {
        return telefone;//GETTER DE TELEFONE DO USUARIO
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;//SETTER DE TELEFONE DO USUARIO
    }


}
