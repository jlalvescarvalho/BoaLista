/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Repositorio;

import br.lk.boalista2.Dao.DaoManagerHiber;
import br.lk.boalista2.Negocio.Marca;
import br.lk.boalista2.Repositorio.Interface.RepositorioGenerico;
import java.util.List;

/**
 *
 * @author Kleriston
 */
public class RepositorioMarca implements RepositorioGenerico<Marca, Long> {

    @Override
    public List recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Marca t) {
       DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Marca t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Marca recuperar(Long chave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Marca t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
