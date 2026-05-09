package cartoes;

import sistema.Usuario;

public class CartaoIdoso extends Cartao {
    public CartaoIdoso(String numeroCartao, String tipoCartao) {
        super(numeroCartao, tipoCartao);
    }

    @Override
    public boolean validarSolicitacao(Usuario usuario) {
        return usuario.getIdade() >= 65;
    }
}
