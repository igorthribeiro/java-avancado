/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.dao;

/**
 *
 * @author 130955800299
 */
public class DAOException extends Exception {
    
    public DAOException() {
        super();
    }
    
    public DAOException(String message) {
        super(message);
    }
    
    public DAOException(Throwable cause) {
        super(cause);
    }
    
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }    
}
