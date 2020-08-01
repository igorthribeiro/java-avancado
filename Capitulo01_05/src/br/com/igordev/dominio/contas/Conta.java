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
public abstract class Conta {

    private static int ultimoCodigo = 0;

    private int codigo;
    private String numero;
    protected double saldo;

    
    public Conta() {
        this.codigo = ++ultimoCodigo;
    }

    public Conta(String numero) {
        this();
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.err.println("Valor incorreto.");
        }
    }
    
    public abstract void saca(double valor);

    @Override
    public String toString() {
        return  new StringBuilder("\tConta: ")
                .append(numero)
                .append("\n\tSaldo: ")
                .append(moeda(saldo)).toString();
    }
    
}
