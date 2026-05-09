package cartoes;

import sistema.Usuario;

public class CartaoEstudante extends Cartao{
    private double saldoEstudante;

    public CartaoEstudante(String numeroCartao, String tipoCartao) {
        super(numeroCartao, tipoCartao);
        saldoEstudante = 0.0;
    }

    @Override
    public boolean validarSolicitacao(Usuario usuario) {
        if(usuario.getIdade() >= 6){
            return usuario.getInstituicao() != null;
        }
        return false;
    }

}
