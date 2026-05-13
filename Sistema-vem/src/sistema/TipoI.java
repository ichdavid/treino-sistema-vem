package sistema;

public enum TipoI {
    ESCOLA(1, "Escola"),
    FACULDADE(2, "Faculdade"),
    HOSPITAL(3, "Hospital");

    private final int codigo;
    private final String nomeTipo;

    TipoI(int codigo, String nomeTipo) {
        this.codigo = codigo;
        this.nomeTipo = nomeTipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public static TipoI selecionarInstituicao(int codigo) {
        for (TipoI t : values()) {
            if (t.codigo == codigo) {
                return t;
            }
        }
        throw new IllegalArgumentException("❌ Opção inválida! tente novamente!");
    }

    public static void exibirOpcoes() {
        System.out.println("\nInstituições:");
        for (TipoI t : values()) {
            System.out.println();
            System.out.println(t.codigo + " ▶ " + t.nomeTipo);
        }
    }


}
