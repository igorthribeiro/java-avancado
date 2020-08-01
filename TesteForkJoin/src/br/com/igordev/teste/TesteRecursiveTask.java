package br.com.igordev.teste;

import br.com.igordev.dominio.CalcSum;
import br.com.igordev.util.Util;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class TesteRecursiveTask {
    public static void main (String...args) {  
        
        Long[] longArray = Util.getRandomArray(1000);
        
        System.out.println("Utilizano ForkJoin: ");
        ForkJoinPool pool = new ForkJoinPool();
        CalcSum calculator = new CalcSum(longArray);
        Long antes = System.currentTimeMillis();
        long soma = pool.invoke(calculator);
        Long depois = System.currentTimeMillis();
        System.out.println("\nResultado: " + soma);
        System.out.printf("Tempo total: %d milissegundos\n", (depois - antes));
        
        List<Long> longs = Arrays.asList(longArray);        
        System.out.println("\n\n\nUtilizano ParallelStream: ");
        antes = System.currentTimeMillis();
        soma = longs.parallelStream().reduce(Long::sum).get();
        depois = System.currentTimeMillis();
        System.out.println("\nResultado: " + soma);
        System.out.printf("Tempo total: %d milissegundos\n", (depois - antes));

    }

}
