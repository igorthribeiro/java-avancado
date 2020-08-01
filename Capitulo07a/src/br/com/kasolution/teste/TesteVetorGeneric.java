package br.com.kasolution.teste;

import br.com.kasolution.dominio.VetorGeneric;

public class TesteVetorGeneric {

    public static void main(String[] args) {
        VetorGeneric<Double> vD = new VetorGeneric<>(3);
        vD.add(1.0);
        vD.add(2.0);
        vD.add(3.0);
        System.out.println("Lista: " + vD);
        System.out.println("Tamanho: " + vD.getSize());
        System.out.println("Removento: "+ vD.remove()); //sai o último (3)
        System.out.println("Lista: " + vD);
        System.out.println("Tamanho: " + vD.getSize());
    }

}
