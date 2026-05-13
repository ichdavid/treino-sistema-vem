package cartoes;

import sistema.Usuario;

public abstract class Cartao {
    private String numeroCartao;
    private String tipoCartao;

    public Cartao ( String numeroCartao, String tipoCartao){
        this.numeroCartao = numeroCartao;
        this.tipoCartao = tipoCartao;


    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public abstract boolean validarSolicitacao(Usuario usuario);

    @Override
    public String toString() {
        return "Cartao{" +
                "numeroCartao='" + numeroCartao + '\'' +
                ", tipoCartao='" + tipoCartao + '\'' +
                '}';
    }
}
