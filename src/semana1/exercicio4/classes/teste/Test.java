package semana1.exercicio4.classes.teste;
import semana1.exercicio4.classes.Motorista;

public class Test {

    public static void main(String[] args) {
        Motorista matheus = new Motorista();
        matheus.setNome("Matheus");
        matheus.setCargo("Motorista");
        matheus.setPlacaCarro("DFG3456");
        matheus.imprime();

        System.out.println("***********************************");

        Motorista filipe = new Motorista();
        filipe.setNome("Filipe");
        filipe.setCargo("Motorista");
        filipe.setPlacaCarro("GFG6996");
        filipe.imprime();
    }
}