/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio;

import static br.com.igordev.util.Formata.moeda;

/**
 *
 * @author igordev
 */
public abstract class Lubrificante {
    
    private double litros;
    private double valorLitro;

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    @Override
    public String toString() {
        String info = "\tLubrificante: " + getClass().getSimpleName();
        info += "\n\tLitros: " + litros;
        info += "\n\tValor litro: " + moeda(valorLitro);
        info += "\n\tTotal: " + moeda(litros * valorLitro);
        return info;
    }
    
    
}
