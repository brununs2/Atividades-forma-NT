package semana1.exercicio1;

import java.util.Scanner;

public class NumerosPares {
    public void imprimirPares(int numero){

        System.out.println("Os números pares de 0 a 100 são:");

        for (int n = 0; n <= numero; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
