/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.enums;

/**
 *
 * @author igordev
 */
public enum Prazo {
    
    SEIS_MESES(6),
    DOZE_MESES(12),
    DEZOITO_MESES(18);
    
    private int meses;
    
    Prazo(int meses) {
        this.meses = meses;
    }
    
    
    public int getPrazo() {
        return meses;
    }
    
}
