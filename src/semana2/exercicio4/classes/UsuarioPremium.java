package semana2.exercicio4.classes;

import semana2.exercicio4.interfaces.Usuario;

public class UsuarioPremium implements Usuario {
    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            valorProduto = valorProduto * 0.30;
            return valorProduto;
        }
        valorProduto = 0;
        return valorProduto;
    }

    @Override
    public String getTipoUsuario() {
        String tipoUsuario = "Premium";
        return tipoUsuario;
    }

    @Override
    public String getValorFreteDesconto(double ValorFrete, double valorProduto) {
        String valorDescontoFrete;
        if (valorProduto > 100) {
            valorDescontoFrete = "Frete Grátis";
            return valorDescontoFrete;
        }
        valorDescontoFrete = "Não tem desconto no frete";
        return valorDescontoFrete;
    }
}