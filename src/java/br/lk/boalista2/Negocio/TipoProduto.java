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

/**
 *
 * @author Luciano
 */
@Entity(name="tipoproduto")
public class TipoProduto implements Serializable {
    
    @Id
    private long id;
    private double valor;

    public TipoProduto() {
    }
    
    
    public TipoProduto(int codigo, String nome, double valor) {
        
        
        this.valor = valor;
    }
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
   
}
