package semana1.exercicio3;

import java.util.Scanner;

public class Palindromo {
    public void imprimirPalindromo() {
        Scanner scanner = new Scanner(System.in);
        String palindromo = "";

        System.out.println("\n Digite uma palavra para verificar se é um palíndromo:");
        String palavra = scanner.nextLine();

        for (int i = (palavra.length() -1); i >= 0; i--) {
            palindromo = palindromo + palavra.charAt(i);
        }


        if (palindromo.toLowerCase().equals(palavra.toLowerCase())) {
            System.out.println("Essa palavra é um palíndromo");
        } else {
            System.out.println("Essa palavra não é um palíndromo");
        }

    }

}
