/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Repositorio;

import br.lk.boalista2.Dao.DaoManagerHiber;
import br.lk.boalista2.Negocio.Usuario;
import static br.lk.boalista2.Negocio.Usuario_.id;
import br.lk.boalista2.Repositorio.Interface.RepositorioGenerico;
import java.util.List;

/**
 *
 * @author Kleriston
 */
public class RepositorioUsuario implements RepositorioGenerico {

    @Override
    public void inserir(Object t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Object t) {
        DaoManagerHiber.getInstance().update(t);
    }

   

    @Override
    public void excluir(Object t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List recuperarTodos() {
      return DaoManagerHiber.getInstance().recover("from usuario");
    }

    @Override
    public Object recuperar(Object chave) {
     return (Usuario) DaoManagerHiber.getInstance().recover(Usuario.class, (Long) chave);
    }
    
    
    
    
    
}
