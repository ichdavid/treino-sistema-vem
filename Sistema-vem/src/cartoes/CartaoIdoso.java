package cartoes;

import sistema.Usuario;

public class CartaoIdoso extends Cartao {
    public CartaoIdoso(String numeroCartao, TipoCartao tipoC) {
        super(numeroCartao, tipoC);
    }

    @Override
    public boolean validarSolicitacao(Usuario usuario) {
        return usuario.getIdade() >= 65;
    }
}
