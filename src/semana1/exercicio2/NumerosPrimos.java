package semana1.exercicio2;

public class NumerosPrimos {
    public void imprimirPrimos (int numero) {
        System.out.println("Os números primos de 0 à 1000 são:");

        out: for (int i = 1; i <= numero; i++) {
            int k;
            for (k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) continue out;
            }
            System.out.printf("%d, ", +i);
        }
    }
}