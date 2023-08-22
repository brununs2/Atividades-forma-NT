package semana2.exercicio4.interfaces;

public interface Usuario {
    double getValorDesconto(double valorProduto);
    String getTipoUsuario();
    String getValorFreteDesconto(double valorValorFrete, double valorProduto);
}
