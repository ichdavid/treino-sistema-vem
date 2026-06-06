package sistema;

public class Empresa {
    private String nomeEmp;
    private String cnpj;

    public Empresa(String nomeEmp, String cnpj) {
        this.nomeEmp = nomeEmp;
        this.cnpj = cnpj;

    }

    public String getNomeEmp() {
        return nomeEmp;
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
