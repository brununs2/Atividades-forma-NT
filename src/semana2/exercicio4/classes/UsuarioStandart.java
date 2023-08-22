package semana2.exercicio4.classes;

import semana2.exercicio4.interfaces.Usuario;

public class UsuarioStandart implements Usuario {
    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            valorProduto = valorProduto * 0.15;
            return valorProduto;
        }
        valorProduto = 0;
        return valorProduto;

    }

    @Override
    public String getTipoUsuario() {
        String tipoUsuario = "Standart";
        return tipoUsuario;
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        String valorDescontoFrete;
        if (valorProduto > 200) {
            valorDescontoFrete = "desconto de 10% no frete, total: " + (valorFrete - (valorFrete * 0.10));
            return valorDescontoFrete;
        }
        valorDescontoFrete = "Desconto não aplicável no frete";
        return valorDescontoFrete;

    }
}