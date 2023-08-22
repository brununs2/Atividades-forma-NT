package semana2.exercicio4.test;

import semana2.exercicio4.classes.UsuarioBase;
import semana2.exercicio4.classes.UsuarioPremium;
import semana2.exercicio4.classes.UsuarioStandart;

public class Menu {

    public static void main(String[] args) {
        int valorProduto = 2000;
        int valorFrete = 80;

        UsuarioBase usuarioBase = new UsuarioBase();
        System.out.println("Usuario: " + usuarioBase.getTipoUsuario());
        System.out.println("Recebeu R$" + usuarioBase.getValorDesconto(valorProduto) + " de desconto no produto");
        System.out.println(usuarioBase.getValorFreteDesconto(valorFrete, valorProduto));

        System.out.println("******************************************************************************");

        UsuarioStandart usuarioStandart = new UsuarioStandart();
        System.out.println("Usuario: " + usuarioStandart.getTipoUsuario());
        System.out.println("Recebeu R$" + usuarioStandart.getValorDesconto(valorProduto) + " de desconto no produto");
        System.out.println(usuarioStandart.getValorFreteDesconto(valorFrete, valorProduto));

        System.out.println("******************************************************************************");

        UsuarioPremium usuarioPremium = new UsuarioPremium();
        System.out.println("Usuario: " + usuarioPremium.getTipoUsuario());
        System.out.println("Recebeu R$" + usuarioPremium.getValorDesconto(valorProduto) + " de desconto no produto");
        System.out.println(usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto));
    }


}