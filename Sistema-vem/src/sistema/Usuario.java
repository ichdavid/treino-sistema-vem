package sistema;

public class Usuario {
    private String nomeUsuario;
    private  String cpf;
    private int idade;
    private Empresa empresaU;
    private Instituicao instituicao;

    public Instituicao
    getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public Empresa getEmpresaU() {
        return empresaU;
    }

    public void setEmpresaU(Empresa empresaU) {
        this.empresaU = empresaU;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
