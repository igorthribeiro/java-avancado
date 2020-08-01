/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igort
 */
public class Funcionario implements Comparable<Funcionario> {

    public static void print(Funcionario f) {
        System.out.println(f);
    }

    private final Integer codigo;
    private final String nome;
    private final char sexo;
    private final Integer idade;
    private final String cidade;
    private final String estado;
    private final Double salario;
    private static final List<Funcionario> funcionarios = new ArrayList<>();
    
    static {
        funcionarios.add(new Funcionario.Builder().codigo(1).nome("Igor").idade(37)
                .sexo('M').cidade("Sao Paulo").estado("SP").salario(7000.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(2).nome("Candido").idade(40)
                .sexo('M').cidade("Sao Paulo").estado("SP").salario(6300.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(3).nome("Victor").idade(57)
                .sexo('M').cidade("Sao Paulo").estado("SP").salario(5900.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(4).nome("Maria Antonia").idade(27)
                .sexo('F').cidade("Uberaba").estado("MG").salario(12000.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(5).nome("Carla").idade(31)
                .sexo('F').cidade("Belo Horizonte").estado("MG").salario(11500.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(6).nome("Renato").idade(43)
                .sexo('M').cidade("Monte Carmelo").estado("MG").salario(8300.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(7).nome("Fernanda").idade(39)
                .sexo('F').cidade("Rio de Janeiro").estado("RJ").salario(9200.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(8).nome("Priscila").idade(50)
                .sexo('F').cidade("Santos").estado("SP").salario(13700.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(9).nome("Robson").idade(45)
                .sexo('M').cidade("Niteroi").estado("RJ").salario(15000.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(10).nome("Leonardo").idade(28)
                .sexo('M').cidade("Nova Iguacu").estado("RJ").salario(21400.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(11).nome("Marcio").idade(21)
                .sexo('M').cidade("Rio de Janeiro").estado("RJ").salario(12700.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(12).nome("Paulo").idade(37)
                .sexo('M').cidade("Belo Horizonte").estado("MG").salario(11200.0).build());
        funcionarios.add(new Funcionario.Builder().codigo(13).nome("Monica").idade(33)
                .sexo('F').cidade("Sao Paulo").estado("SP").salario(6700.0).build());  
        funcionarios.add(new Funcionario.Builder().codigo(14).nome("Jefferson").idade(41)
                .sexo('M').cidade("Uberlandia").estado("MG").salario(9200.0).build());       
        funcionarios.add(new Funcionario.Builder().codigo(15).nome("Sandra").idade(55)
                .sexo('F').cidade("Brasilia").estado("DF").salario(12500.0).build());       
        funcionarios.add(new Funcionario.Builder().codigo(16).nome("Luciano").idade(43)
                .sexo('M').cidade("Brasilia").estado("DF").salario(11100.0).build());       
        funcionarios.add(new Funcionario.Builder().codigo(17).nome("Anderson").idade(39)
                .sexo('M').cidade("Sao Paulo").estado("SP").salario(8600.0).build());       
        funcionarios.add(new Funcionario.Builder().codigo(18).nome("Guilherme").idade(26)
                .sexo('M').cidade("Igarapava").estado("SP").salario(10300.0).build());       
        funcionarios.add(new Funcionario.Builder().codigo(19).nome("Sabrina").idade(28)
                .sexo('F').cidade("Uberaba").estado("MG").salario(9900.0).build());       
        funcionarios.add(new Funcionario.Builder().codigo(20).nome("Eduardo").idade(27)
                .sexo('M').cidade("Niteroi").estado("RJ").salario(7800.0).build());       
    }

    @Override
    public int compareTo(Funcionario f) {
        return this.nome.compareTo(f.nome);
    }

    //compareTo

    public static class Builder {

        private Integer codigo;
        private String nome = "";
        private char sexo = '\u0000';
        private Integer idade= 0;
        private String cidade = "";
        private String estado = "";
        private Double salario = 0.0;

        public Funcionario.Builder codigo(Integer codigo) {
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
        
        public Funcionario.Builder idade(Integer idade) {
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
        
        public Funcionario.Builder salario(Double salario) {
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
    
    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public Double getSalario() {
        return salario;
    }

    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    
    
}
