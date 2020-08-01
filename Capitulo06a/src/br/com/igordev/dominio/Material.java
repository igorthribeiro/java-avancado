/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio;

/**
 *
 * @author igordev
 */

import static br.com.igordev.util.Formata.*;

public abstract class Material {
    
    private double quantidade;
    private double valorUnitario;

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        String info = "\nMaterial: " + getClass().getSimpleName();
        info += "\n\tQuantidade: " + quantidade;
        info += "\n\tValor unit.: " + moeda(valorUnitario);
        info += "\n\tTotal: " + moeda(quantidade * valorUnitario);
        return info;
    }
    
    
}
