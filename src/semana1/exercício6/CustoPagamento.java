package semana1.exercício6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CustoPagamento {

    public void imprimircp() {
        Scanner valor = new Scanner(System.in);

        double produto, pago;


        System.out.println("Valor do produto: ");
        produto = valor.nextDouble();

        System.out.println("Valor Pago:       ");
        pago = valor.nextDouble();

        System.out.printf("%s", calculaTroco(produto, pago));

    }

    public static String calculaTroco(double produto, double pago) {
        DecimalFormat formatador = new DecimalFormat("###,##0.00");
        if (pago < produto)
            return("\nPagamento insuficiente, faltam R$"+
                    formatador.format(produto - pago) +"\n");
        else {
            int nota[] = {100, 50, 20, 10, 5, 2, 1};
            int centavos[] = {50, 25, 10, 5, 1};

            String result;
            double troco;
            int i, valor, conta;

            troco = pago - produto;
            result ="\nTroco = R$"+ formatador.format(troco) +"\n\n";

            valor = (int)troco;
            i = 0;
            while (valor != 0) {
                conta = valor / nota[i];
                if (conta != 0) {
                    result = result + (conta + " nota(s) de R$" + nota[i] + "\n");
                    valor = valor % nota[i]; // sobra
                }
                i = i + 1;
            }

            result = result +"\n";

            valor = (int)Math.round((troco - (int)troco) * 100);
            i = 0;
            while (valor != 0) {
                conta = valor / centavos[i];
                if (conta != 0) {
                    result = result + (conta + " moeda(s) de " + centavos[i] + " centavo(s)\n");
                    valor = valor % centavos[i];
                }
                i = i + 1;
            }

            return(result);
        }
    }

}
