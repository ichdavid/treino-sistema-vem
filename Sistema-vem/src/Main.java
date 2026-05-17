import sistema.Empresa;
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
        List<Empresa> listaEmpresas = new ArrayList<>();

        int opcao;

        do {
            imprimirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarUsuario(sc, listUsuario);
                    break;
                case 2:
                    cadastrarEmpresa(sc, listaEmpresas);
                    break;
                case 5:
                    if(listUsuario.isEmpty()){
                        System.out.println("\nNenhum usuario cadastrado!");
                    }else{
                        for(Usuario u : listUsuario){
                            System.out.println(u);
                        }
                    }
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

    private static void cadastrarUsuario(Scanner sc, List<Usuario> listUsuario) {
        System.out.println("\n============================");
        System.out.println("=   Cadastro de Usuário    =");
        System.out.println("============================");

        System.out.print("\nDigite o CPF do usuário: ");
        String cpf = sc.nextLine();

        System.out.print("\nDigite o nome do usuário: ");
        String nome = sc.nextLine();

        int idade;

        while (true) {

            System.out.print("\nDigite a idade: ");

            if (sc.hasNextInt()) {
                idade = sc.nextInt();
                sc.nextLine(); // limpa o ENTER
                break;
            } else {
                System.out.println("❌ ERRO: Digite apenas números!");
                sc.nextLine(); // limpa entrada inválida
            }

        }

        if(idade > 2){
            Usuario usuario = new Usuario(cpf, nome, idade);
            listUsuario.add(usuario);

            System.out.println("\nUsuário cadastrado com sucesso!");
        }else{
            System.out.println("idade não permitida!");
        }

    }

    private static void cadastrarEmpresa(Scanner sc, List<Empresa> listEmpresa){}

    private static void cadastrarInstituicao(Scanner sc, List<Instituicao> listInstituicao){}








}
