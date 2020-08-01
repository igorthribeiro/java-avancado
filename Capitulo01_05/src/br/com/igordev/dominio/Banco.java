/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igordev
 */

//Singleton
public class Banco {

    private static final Banco instance = new Banco();
    
    private String nome;
    private List<Cliente> clientes;

    private Banco() {
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static Banco getInstance() {
        return instance;
    }

    public void adiciona(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        } else {
            System.out.println("A pessoa informada já é cliente.");
        }
    }
    
    public void remove(Cliente cliente) {
        if (clientes.contains(cliente)) {
            clientes.remove(cliente);
        } else {
            System.out.println("Cliente não localizado.");
        }
    }

    @Override
    public String toString() {
        String info = "[= Banco: " + nome + " =]";
        info += "\nRelação de Clientes:";
        for (Cliente c : clientes) {
            info += "\n" + c + "\n";
        }
        return info;
    }
    
    
}
