
import com.kasolution.example.Funcionario;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 130955800299
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Funcionario> emps = Funcionario.getFuncionarios();
        double total = emps.parallelStream()
                .mapToDouble(Funcionario::getSalario).reduce(0, (e, sum) -> e + sum);
        System.out.println("Soma dos salários: " + fC(total));
        //String nomes = emps.stream()
        //        .map(Funcionario::getNome).collect(Collectors.joining());
        String nomes = emps.parallelStream()
                .map(Funcionario::getNome).reduce("", String::concat);
        System.out.println("Nome por virgula: " + nomes);
    }

    public static String fC(double valor) {
        return NumberFormat.getCurrencyInstance().format(valor);
    }

}
