package cartoes;

import sistema.*;

public class CartaoComum extends Cartao{

    private double SaldoComum;

    public CartaoComum(String numeroCartao, TipoCartao tipoC) {
        super(numeroCartao, tipoC);
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
