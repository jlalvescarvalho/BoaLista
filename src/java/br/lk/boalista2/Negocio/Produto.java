/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Kleriston
 */
@Entity(name="produto")
public class Produto implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    private int codigo;
    private String nome;
    
    @OneToOne(mappedBy = "produto")
    private Marca marca;
   

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        
       
    }
     public Produto() {
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
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

    public long getId() {
        return id;
    }

   
    public void setId(Long id){
        this.id = id;
    }
  
    
}
