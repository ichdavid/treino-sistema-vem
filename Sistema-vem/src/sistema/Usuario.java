package sistema;

import cartoes.*;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nomeUsuario;
    private  String cpf;
    private int idade;
    private Empresa empresaU;
    private Instituicao instituicao;
    private List<Cartao> listaCartoes;

    public Usuario (String cpf, String nomeUsuario, int idade) {
        this.cpf = cpf;
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.listaCartoes = new ArrayList<>();

    }

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

    public List<Cartao> getListaCartoes() {
        return listaCartoes;
    }

    public void setListaCartoes(List<Cartao> listaCartoes) {
        this.listaCartoes = listaCartoes;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", empresaU=" + empresaU +
                ", instituicao=" + instituicao +
                '}';
    }
}
