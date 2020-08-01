/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.dao;

import java.util.List;

/**
 *
 * @author 130955800299
 */
public interface DAO<T> extends AutoCloseable {
    
    public void salvar(T t) throws DAOException;
    public void atualizar(T t) throws DAOException;
    public boolean excluir(T t) throws DAOException;
    public T buscarId(int id) throws DAOException;
    public List<T> buscarTodos() throws DAOException;  
    public void close() throws DAOException;
    
}
