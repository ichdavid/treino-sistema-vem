package cartoes;

import sistema.Usuario;

public class CartaoTrabalhador extends Cartao{
    private double saldoTrabalhador;

    public CartaoTrabalhador(String numeroCartao, String tipoCartao) {
        super(numeroCartao, tipoCartao);
        saldoTrabalhador = 0.0;
    }

    @Override
    public boolean validarSolicitacao(Usuario usuario) {
        return usuario.getEmpresaU() != null;

    }

    public double getSaldoTrabalhador() {
        return saldoTrabalhador;
    }

    public void setSaldoTrabalhador(double saldoTrabalhador) {
        this.saldoTrabalhador = saldoTrabalhador;
    }
}
