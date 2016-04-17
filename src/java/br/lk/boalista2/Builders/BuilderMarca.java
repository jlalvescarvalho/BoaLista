/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Builders;

import br.lk.boalista2.Negocio.Marca;
import br.lk.boalista2.Negocio.Produto;

/**
 *
 * @author Kleriston
 */
public class BuilderMarca {
     private long id;
    private String marca;
    private Produto produto;

    public BuilderMarca(String marca, Produto produto) {
        this.marca = marca;
        this.produto= produto;
    }

 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Marca BuilderMarca(){
        return new Marca(marca, produto);
    }
    
}
