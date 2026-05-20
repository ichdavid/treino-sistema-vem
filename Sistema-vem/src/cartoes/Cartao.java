package cartoes;

import sistema.Usuario;

public abstract class Cartao {
    private String numeroCartao;
    private TipoCartao tipoC;

    public Cartao(String numeroCartao, TipoCartao tipoC) {
        this.numeroCartao = numeroCartao;
        this.tipoC = tipoC;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public TipoCartao getTipoC() {
        return tipoC;
    }

    public void setTipoC(TipoCartao tipoC) {
        this.tipoC = tipoC;
    }

    public abstract boolean validarSolicitacao(Usuario usuario);

    @Override
    public String toString() {
        return "Cartao{" +
                "numeroCartao='" + numeroCartao + '\'' +
                ", tipoC=" + tipoC +
                '}';
    }
}
