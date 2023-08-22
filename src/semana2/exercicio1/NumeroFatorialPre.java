package semana2.exercicio1;

//método número pré programado
public class NumeroFatorialPre {
    public void imprimirFatorialPre (int numero) {

        long fatorial = 1;
        int i = 1;

        while (i<= numero) {
            fatorial = fatorial * i;
            i++;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
