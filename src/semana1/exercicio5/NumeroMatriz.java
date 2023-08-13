package semana1.exercicio5;

import java.util.Scanner;

public class NumeroMatriz {
    public void imprimirMatriz() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para definir a sua matriz identidade: ");
        int tamanho = scan.nextInt();

        int[][] matriz = new int[tamanho][tamanho];
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                matriz[linhas][colunas] = linhas == colunas ? 1 : 0;
                System.out.print(matriz[linhas][colunas] + " \n");
            }
        }
    }
}
