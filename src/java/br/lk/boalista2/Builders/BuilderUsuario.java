/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Builders;

import br.lk.boalista2.Negocio.Usuario;

/**
 *
 * @author Kleriston
 */
public class BuilderUsuario {
    
    
     private Long id;
    
    private String nome;
    private String sobrenome;
    private String email;
    private String login;
    private String senha;

    public BuilderUsuario( String nome, String sobrenome, String email, String login, String senha) {
       
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.login =login;
        this.senha = senha;
       
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public Usuario BuilderUsuario(){
       return new Usuario(this.nome, this.sobrenome, this.email,this.login, this.senha);
    }
    
    
}
