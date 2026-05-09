package cartoes;

import sistema.Usuario;

public class CartaoInfantil extends Cartao{
    public CartaoInfantil(String numeroCartao, String tipoCartao) {
        super(numeroCartao, tipoCartao);
    }

    @Override
    public boolean validarSolicitacao(Usuario usuario) {
        return usuario.getIdade() >= 3 && usuario.getIdade() < 6;
    }
}
