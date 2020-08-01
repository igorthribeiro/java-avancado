/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igort
 */
public class Funcionario implements Comparable<Funcionario> {

    private final int codigo;
    private final String nome;
    private final char sexo;
    private final int idade;
    private final String cidade;
    private final String estado;
    private final double salario;
    private static final List<Funcionario> clientes = new ArrayList<>();
    
    static {
        clientes.add(new Funcionario.Builder().codigo(1).nome("Igor").idade(37)
                .sexo('M').cidade("São Paulo").estado("SP").salario(7000.0).build());
        clientes.add(new Funcionario.Builder().codigo(2).nome("Candido").idade(40)
                .sexo('M').cidade("São Paulo").estado("SP").salario(6300.0).build());
        clientes.add(new Funcionario.Builder().codigo(3).nome("Victor").idade(55)
                .sexo('M').cidade("São Paulo").estado("SP").salario(5900.0).build());
        clientes.add(new Funcionario.Builder().codigo(4).nome("Maria Antônia").idade(27)
                .sexo('F').cidade("Uberaba").estado("MG").salario(12000.0).build());
        clientes.add(new Funcionario.Builder().codigo(5).nome("Carla").idade(31)
                .sexo('F').cidade("Belo Horizont").estado("MG").salario(11500.0).build());
        clientes.add(new Funcionario.Builder().codigo(6).nome("Renato").idade(43)
                .sexo('M').cidade("Monte Carmelo").estado("MG").salario(8300.0).build());
        clientes.add(new Funcionario.Builder().codigo(7).nome("Fernanda").idade(39)
                .sexo('F').cidade("Rio de Janeiro").estado("RJ").salario(9200.0).build());
        clientes.add(new Funcionario.Builder().codigo(8).nome("Priscila").idade(50)
                .sexo('F').cidade("Santos").estado("SP").salario(13700.0).build());
        clientes.add(new Funcionario.Builder().codigo(9).nome("Robson").idade(45)
                .sexo('M').cidade("Niterói").estado("RJ").salario(15000.0).build());
        clientes.add(new Funcionario.Builder().codigo(10).nome("Leonardo").idade(28)
                .sexo('M').cidade("Nova Iguaçu").estado("RJ").salario(21400.0).build());
        clientes.add(new Funcionario.Builder().codigo(11).nome("Márcio").idade(21)
                .sexo('M').cidade("Rio de Janeiro").estado("RJ").salario(12700.0).build());
        clientes.add(new Funcionario.Builder().codigo(12).nome("Paulo").idade(37)
                .sexo('M').cidade("Belo Horizonte").estado("SP").salario(11200.0).build());
        clientes.add(new Funcionario.Builder().codigo(13).nome("Mônica").idade(33)
                .sexo('F').cidade("São Paulo").estado("SP").salario(6700.0).build());       
    }

    @Override
    public int compareTo(Funcionario t) {
        Integer i1 = this.getCodigo();
        Integer i2 = t.getCodigo();
        return i1.compareTo(i2);
    }

    public static class Builder {

        private int codigo;
        private String nome = "";
        private char sexo = '\u0000';
        private int idade= 0;
        private String cidade = "";
        private String estado = "";
        private double salario = 0.0;

        public Funcionario.Builder codigo(int codigo) {
            this.codigo = codigo;
            return this;
        }
        
        public Funcionario.Builder nome(String nome) {
            this.nome = nome;
            return this;
        }
        
        public Funcionario.Builder sexo(char sexo) {
            this.sexo = (sexo == 'M' || sexo == 'm') ? 'M' : 'F';
            return this;
        }
        
        public Funcionario.Builder idade(int idade) {
            this.idade = idade;
            return this;
        }
        
        public Funcionario.Builder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }
        
        public Funcionario.Builder estado(String estado) {
            this.estado = estado;
            return this;
        }
        
        public Funcionario.Builder salario(double salario) {
            this.salario = salario;
            return this;
        }
        
        public Funcionario build() {
            return new Funcionario(this);
        }
    }
    
    private Funcionario(Funcionario.Builder builder) {
        this.codigo = builder.codigo;
        this.nome = builder.nome;
        this.sexo = builder.sexo;
        this.idade = builder.idade;
        this.cidade = builder.cidade;
        this.estado = builder.estado;
        this.salario = builder.salario;
    }

    @Override
    public String toString() {
        return "Funcionario {" + "Código: " + codigo + ", Nome: " + nome + ", Sexo: " + sexo + ","
                + " Idade: " + idade + ", Cidade: " + cidade + ", Estado: " + estado + ", Salário: " + salario + '}';
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public double getSalario() {
        return salario;
    }

    public static List<Funcionario> getFuncionarios() {
        return clientes;
    }

    public static void print(Funcionario f) {
        System.out.println(f.toString());
    }    
   
}
