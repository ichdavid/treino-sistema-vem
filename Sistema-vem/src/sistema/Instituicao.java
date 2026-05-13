package sistema;

public class Instituicao {
    private String nomeI;
    private TipoI tipoInstituicao;

    public Instituicao(String nomeI, TipoI tipoInstituicao) {
        this.nomeI = nomeI;
        this.tipoInstituicao = tipoInstituicao;
    }

    public String getNomeI() {
        return nomeI;
    }

    public void setNomeI(String nomeI) {
        this.nomeI = nomeI;
    }

    public TipoI getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(TipoI tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }
}
