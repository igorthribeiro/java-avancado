/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.dominio;

/**
 *
 * @author Aluno
 */
public class SistemaException extends Exception {

    public SistemaException() {
    }

    public SistemaException(String string) {
        super(string);
    }

    public SistemaException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public SistemaException(Throwable thrwbl) {
        super(thrwbl);
    }
    
}
