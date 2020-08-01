package br.com.kasolution.domino;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario implements Comparable<Funcionario>{

    private String nome; //classe java
    private LocalDate dataAdmissao; //classe java
    private double salario; //primitivo

//    @Override
//    public int compareTo(Funcionario f) {
//        //comparação do salario
////        if (this.salario > f.salario) {
////            return 1; //qq numero positivo
////        } else if (this.salario < f.salario) {
////            return -1; //qq numero negativo
////        } else {
////            return 0;
////        }
//          return (int) (f.salario - this.salario);
//    }

//    @Override
//    public int compareTo(Funcionario f) {
//        return this.nome.compareTo(f.nome);
//    }

    @Override
    public int compareTo(Funcionario f) {
        return this.dataAdmissao.compareTo(f.dataAdmissao);
    }

    public static class Builder { //ALT+SHIT+F
        private String nome = "-- não informado --";
        private LocalDate dataAdmissao = LocalDate.now();
        private double salario = 0.0;

        public Funcionario.Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Funcionario.Builder dataAdmissao(LocalDate dataAdmissao) {
            this.dataAdmissao = dataAdmissao;
            return this;
        }

        public Funcionario.Builder salario(double salario) {
            this.salario = salario;
            return this;
        }
        
        public Funcionario build() {
            return new Funcionario(this); //ligação entre o Builder(this) com a class top level (Funcionario)
        }
        
    }//fim Builder
    
    //construtor que recebe o Builder (funcionario construido)
    private Funcionario(Funcionario.Builder builder) {
        this.nome = builder.nome;
        this.dataAdmissao = builder.dataAdmissao;
        this.salario = builder.salario;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionário{" + "Nome: " + nome + ", Data Admissão: " + dataAdmissao + ", Salário: " + salario + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.dataAdmissao, other.dataAdmissao)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.dataAdmissao);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        return hash;
    }
}//fim class
