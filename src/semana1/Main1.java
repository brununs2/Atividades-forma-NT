package semana1;

import semana1.exercicio1.NumerosPares;
import semana1.exercicio2.NumerosPrimos;
import semana1.exercicio3.Palindromo;
import semana1.exercicio5.NumeroMatriz;
import semana1.exercício6.CustoPagamento;

public class Main1 {
    public static void main(String[] args) {

        //Exercício 1
        NumerosPares numerosPares = new NumerosPares();
        numerosPares.imprimirPares(100);

        //Exercício 2
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.imprimirPrimos(1000);

        //Exercício 3
        Palindromo palindromo = new Palindromo();
        palindromo.imprimirPalindromo();

        //Exercício 5
        NumeroMatriz numeroMatriz = new NumeroMatriz();
        numeroMatriz.imprimirMatriz();

        //Exercício 6
        CustoPagamento custoPagamento = new CustoPagamento();
        custoPagamento.imprimircp();
    }
}