package semana2.exercicio4.classes;

import semana2.exercicio4.interfaces.Usuario;

public class UsuarioBase implements Usuario {

    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 300) {
            valorProduto = valorProduto * 0.05;
            return valorProduto;
        }
        valorProduto = 0;
        return valorProduto;
    }

    @Override
    public String getTipoUsuario() {
        String tipoUsuario = "Base";
        return tipoUsuario;
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {

        String valorDescontoFrete;
        if (valorProduto > 300) {
            valorDescontoFrete = "desconto de 5% no frete, total: " + (valorFrete - (valorFrete * 0.05));
            return valorDescontoFrete;
        }
        valorDescontoFrete = "Desconto não aplicável no frete";
        return valorDescontoFrete;
    }

}
