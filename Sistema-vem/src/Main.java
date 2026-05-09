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


}
