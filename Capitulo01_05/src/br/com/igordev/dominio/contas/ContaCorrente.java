/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio.contas;

import static br.com.igordev.util.Formata.moeda;

/**
 *
 * @author igordev
 */
public class ContaCorrente extends Conta {
    
    private double limiteEspecial;
    
    public ContaCorrente() {
        
    }
    
    public ContaCorrente(String numero, double limiteEspecial) {
        super(numero);
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\n\t[* Conta corrente *]")
                .append("\n\tLimite Especial: ")
                .append(moeda(limiteEspecial))
                .toString();
    }

    @Override
    public void saca(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
