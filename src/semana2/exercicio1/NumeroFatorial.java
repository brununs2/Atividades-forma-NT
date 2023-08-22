package semana2.exercicio1;

import java.util.Scanner;

public class NumeroFatorial {
    public void imprimirFatorial () {

        System.out.println("Informe o número para calcular o fatorial: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        long fatorial = 1;
        int i = 1;

        while (i<= numero) {
            fatorial = fatorial * i;
            i++;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}