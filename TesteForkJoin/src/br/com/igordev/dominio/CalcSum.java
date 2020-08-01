package br.com.igordev.dominio;


import java.util.concurrent.RecursiveTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 130955800299
 */
public class CalcSum extends RecursiveTask<Long> {

    private static final int UNIT_SIZE = 10;//= 1000;
    private Long[] values;
    private int startPos;
    private int endPos;

    public CalcSum(Long[] values) {
        this(values, 0, values.length);
    }

    public CalcSum(Long[] values, int startPos, int endPos) {
        this.values = values;
        this.startPos = startPos;
        this.endPos = endPos;
    }

    //método recursivo utilizado pelo ForkJoinPool.invoke()
    @Override
    protected Long compute() {
        final int currentSize = endPos - startPos;

        if (currentSize <= UNIT_SIZE) {
            //calcula o restante do vetor
            return computeSum();
        } else {
            //divide em duas partes e passa cada parte para o
            //construtor de forma recursiva
            int center = currentSize / 2;
            int leftEnd = startPos + center;
            //metade da esquerda
            CalcSum leftSum = new CalcSum(values, startPos, leftEnd);
            //faz a execução assincrona;
            leftSum.fork();

            //metade da direita
            int rigthStart =  leftEnd;
            CalcSum rigthSum = new CalcSum(values, rigthStart, endPos);
            //o metodo "join" faz com que o valor de leftSum seja aguardado
            return (rigthSum.compute() + leftSum.join());
            //return (leftSum.join() + rigthSum.compute()); //--> funciona mas não se beneficia dos recursos do fork/join
        }
    }

    private long computeSum() {
        long sum = 0;
        for (int i = startPos; i < endPos; i++) {
            sum += values[i];
        }
        //System.out.println("Sum(" + startPos + " - " + (endPos-1) + "):" + sum);
        return sum;
    }
}
