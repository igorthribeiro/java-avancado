package br.com.kasolution.teste;

import br.com.kasolution.dominio.VetorInteger;

public class TesteVetorInteger {

    public static void main(String[] args) {
        VetorInteger vI = new VetorInteger(3);
        vI.add(1);
        vI.add(2);
        vI.add(3);
        System.out.println("Lista: " + vI);
        System.out.println("Tamanho: " + vI.getSize());
        System.out.println("Removento: "+ vI.remove()); //sai o último (3)
        System.out.println("Lista: " + vI);
        System.out.println("Tamanho: " + vI.getSize());
    }

}
