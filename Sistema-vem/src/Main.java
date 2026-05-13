import sistema.Instituicao;
import sistema.TipoI;
import sistema.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Usuario> listUsuario = new ArrayList<>();

        int opcao;

        do {
            imprimirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    break;

                case 0:
                    System.out.println("Encerrando Programa. ");
                    break;

                default:
                    System.out.println("Opção Inválida. ");

            }

        } while (opcao != 0);

    }

    private static void imprimirMenu(){
        System.out.println("============================");
        System.out.println("         Cartão VAI         ");
        System.out.println("============================");
        System.out.println("1 - Cadastrar usuário       ");
        System.out.println("2 - Cadastrar empresa       ");
        System.out.println("3 - Cadastrar instituição   ");
        System.out.println("4 - Solicitar cartão        ");
        System.out.println("5 - perfil usuario          ");
        System.out.println("6 - lista de cartões        ");
        System.out.println("0 - sair                    ");
        System.out.println("============================");
        System.out.println();
        System.out.print("Digite uma opção (0-6): ");
    }


}
