package br.com.kasolution.teste;

import br.com.kasolution.dominio.VetorString;

public class TesteVetorString {

    public static void main(String[] args) {
        VetorString vS = new VetorString(3);
        vS.add("A");
        vS.add("B");
        vS.add("C");
        System.out.println("Lista: " + vS);
        System.out.println("Tamanho: " + vS.getSize());
        System.out.println("Removento: "+ vS.remove()); //sai o último ("C")
        System.out.println("Lista: " + vS);
        System.out.println("Tamanho: " + vS.getSize());
    }

}
