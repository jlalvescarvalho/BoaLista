/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Fachada;

import br.lk.boalista2.Dao.DaoManagerHiber;
import br.lk.boalista2.Negocio.Marca;
import br.lk.boalista2.Negocio.Produto;
import br.lk.boalista2.Negocio.Usuario;
import br.lk.boalista2.Repositorio.Interface.RepositorioGenerico;
import br.lk.boalista2.Repositorio.RepositorioMarca;
import br.lk.boalista2.Repositorio.RepositorioProduto;
import br.lk.boalista2.Repositorio.RepositorioUsuario;
import java.util.List;

/**
 *
 * @author Kleriston
 */
public class Fachada {
    
    private static Fachada myself = null;
           
    
    private RepositorioGenerico<Produto, Long> repProduto = null;
    private RepositorioGenerico<Usuario, Long> repUsuario = null;
     private RepositorioGenerico<Marca, Long> repMarca = null;

    public Fachada() {
        
        this.repProduto= new RepositorioProduto();
        this.repUsuario = new RepositorioUsuario();
        this.repMarca = new RepositorioMarca();
    }
    
    public static Fachada getStance(){
        if(myself == null)
            myself = new Fachada();
        
        return myself;
    }
    
    public void inserir(Produto produto){
        this.repProduto.inserir(produto);
    }
    public void alterar(Produto produto ){
        this.repProduto.alterar(produto);
    }
    
    public void excluir(Produto produto){
        this.repProduto.excluir(produto);
    }
    
    public Produto recuperarProduto(Long id){
        return this.repProduto.recuperar(id);
    }
    
    public List<Produto> recuperarTodos(){
        return  this.repProduto.recuperarTodos();
    }
    
    
    
    public void inserirusuario(Usuario usuario){
        this.repUsuario.inserir(usuario);
    }
    
    public void alterarUsuario(Usuario usuario){
        this.repUsuario.alterar(usuario);
    }
    
    public void excluirUsuario(Usuario usuario){
        this.repUsuario.excluir(usuario);
    }
    
    public Usuario recuperarUsuario(Long id){
        return this.repUsuario.recuperar(id);
    }
    
    public List<Usuario> listarUsuario(){
        return this.repUsuario.recuperarTodos();
    }
    
    public void inserirMarca(Marca marca){
        this.repMarca.inserir(marca);
    }
    
}
