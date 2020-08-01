/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.domain;

import java.text.NumberFormat;

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
                + " Idade: " + idade + ", Cidade: " + cidade + ", Estado: " + estado + ", Salário: "
                + NumberFormat.getCurrencyInstance().format(salario) + '}';
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

    public static void print(Funcionario f) {
        System.out.println(f.toString());
    }    
   
}
