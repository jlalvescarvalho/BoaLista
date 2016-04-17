/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Builders;

import br.lk.boalista2.Negocio.Produto;

public class BuilderProduto {
    
    
    private long id;
    private int codigo;
    private String nome;

    public BuilderProduto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    

    public long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
      public Produto BuilderProduto(){
        return new Produto(this.codigo, this.nome);
    }
    
}
