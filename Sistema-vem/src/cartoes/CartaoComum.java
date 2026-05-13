package cartoes;

import sistema.Usuario;

public class CartaoComum extends Cartao{

    private double SaldoComum;

    public CartaoComum(String numeroCartao, String tipoCartao) {
        super(numeroCartao, tipoCartao);
        SaldoComum = 0.0;

    }


    @Override
    public boolean validarSolicitacao(Usuario usuario) {
        return true;
    }

    public double getSaldoComum() {
        return SaldoComum;
    }

    public void setSaldoComum(double saldoComum) {
        SaldoComum = saldoComum;
    }

}
