package semana2;

import semana2.exercicio1.NumeroFatorial;
import semana2.exercicio1.NumeroFatorialPre;
import semana2.exercicio2.CifraCesar;
import semana2.exercicio3.CifraVigenere;

public class Main2 {

    public static void main(String[] args) {

        //Exercício 1
        NumeroFatorialPre numeroFatorialPre = new NumeroFatorialPre();
        numeroFatorialPre.imprimirFatorialPre(5);

        NumeroFatorial numeroFatorial = new NumeroFatorial();
        numeroFatorial.imprimirFatorial();

        //Exercício 2
        CifraCesar cifraCesar = new CifraCesar();
        cifraCesar.imprimirCesar();

        //Exercício 3
        CifraVigenere cifraVigenere = new CifraVigenere();
        cifraVigenere.imprimirVigenere();
    }
}
