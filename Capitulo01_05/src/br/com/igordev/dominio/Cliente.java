/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio;

import br.com.igordev.dominio.contas.Conta;

/**
 *
 * @author igordev
 */
public class Cliente {
    
    private static int ultimoCodigo = 0;
    
    private int codigo;
    private String nome;
    private String cpf;
    private Conta[] contas;
    private int qtdContas;
    
    
    public Cliente() {
        this.codigo = ++ultimoCodigo;
        this.contas = new Conta[4];
    }
    
    public Cliente(String nome) {
        this();
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaConta(Conta conta) {
        if (qtdContas < 4) {
            this.contas[qtdContas++] = conta;
        } else {
            System.out.println("Limite de contas por cliente atingido.");
        }
    }
    
    public void adicionaConta(Conta...contas) {
        for (Conta c : contas) {
            adicionaConta(c);
        }
    }

    @Override
    public String toString() {
        String info = "Cliente: " + nome;
        info += "\nRelação de contas:";
        for (Conta c : contas) {
            if (c != null) {
                info += "\n" + c + "\n";
            }
        }
        return info;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cliente) {
            Cliente cliente = (Cliente) obj;
            return this.cpf.equals(cliente.getCpf());
        }
        return false;
    }
}
