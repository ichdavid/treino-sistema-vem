import cartoes.Cartao;
import cartoes.CartaoComum;
import sistema.Empresa;
import sistema.Instituicao;
import sistema.TipoI;
import sistema.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //METODO ONDE RODA O PROGRAMA
    public static void main(String[] args) {

        //CRIAÇÃO DO SCANER E DAS LISTAS
        Scanner sc = new Scanner(System.in);
        List<Usuario> listaUsuario = new ArrayList<>();
        List<Empresa> listaEmpresas = new ArrayList<>();

        int opcao;

        do {
            //CHAMANDO O MENU PARA O USUÁRIO ESCOLHER A OPÇÃO
            imprimirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            //EXECUÇÃO DA FUNÇÃO SELECIONADA PELO USUARIO
            switch (opcao) {
                case 1:
                    cadastrarUsuario(sc, listaUsuario);
                    break;
                case 2:
                    cadastrarEmpresa(sc, listaEmpresas);
                    break;
                case 4:
                    break;
                case 5:
                    if(listaUsuario.isEmpty()){
                        System.out.println("\nNenhum usuario cadastrado!");
                    }else{
                        for(Usuario u : listaUsuario){
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

    // METODO PARA IMPRIMIR AS INFORMAÇÕES DO MENU
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

    private static void imprimirMenuCatoes(){
        System.out.println("============================");
        System.out.println("         Cartão VAI         ");
        System.out.println("============================");
        System.out.println("1 - VAI COMUM               ");
        System.out.println("2 - VAI ESTUDANTE           ");
        System.out.println("3 - VAI TRABALHADOR         ");
        System.out.println("4 - VAI INFANTIL            ");
        System.out.println("5 - VAI IDOSO               ");
        System.out.println("0 - Voltar                  ");
        System.out.println("============================");
        System.out.println();
        System.out.print("Digite uma opção (0-5): ");
    }

    // METODO PARA FAZER O CADASTRO DO USUARIO
    private static void cadastrarUsuario(Scanner sc, List<Usuario> listaUsuario) {
        System.out.println("\n============================");
        System.out.println("=   Cadastro de Usuário    =");
        System.out.println("============================");

        String cpf = formatoCpf(sc);
        int existeUsuario = buscarUsuario(cpf, listaUsuario);
        if(existeUsuario != -1){
            System.out.println("\n❌ CPF já cadastrado no sistema!");
            return;
        }else{
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
                    System.out.println("\n❌ ERRO: Digite apenas números!, tente novamente!");
                    sc.nextLine(); // limpa entrada inválida
                }



            }

            if(idade > 0 && idade <= 123){
                Usuario usuario = new Usuario(cpf, nome, idade);
                listaUsuario.add(usuario);

                System.out.println("\nUsuário cadastrado com sucesso!");
                System.out.println();
            }else{
                System.out.println("\nidade não permitida!");
                System.out.println();
            }



        }



    }

    //METODO PARA FAZER O CADASTRO DA EMPRESA
    private static void cadastrarEmpresa(Scanner sc, List<Empresa> listEmpresa){}

    //METODO PARA FAZER O CADASTRO DA INSTITUIÇÃO
    private static void cadastrarInstituicao(Scanner sc, List<Instituicao> listInstituicao){}



    private static void solicitarCartao(Scanner sc, List<Usuario> listaUsuarios){

        int opcao;

        do{
            //Imprime o menu de cartões
            imprimirMenuCatoes();
            opcao = sc.nextInt();
            sc.nextLine();

            //EXECUÇÃO DA FUNÇÃO SELECIONADA PELO USUARIO
            switch (opcao) {
                case 1:
                    String cpfU = formatoCpf(sc);
                    int usuarioExiste = buscarUsuario(cpfU, listaUsuarios);

                    Usuario u = listaUsuarios.get(usuarioExiste);

                    CartaoComum cartaoC = new CartaoComum("10.90.45645465-6", "VAI COMUM");
                    Boolean verificarC = cartaoC.validarSolicitacao(u);

                    if (verificarC) {
                        u.getListaCartoes().add(cartaoC);
                        System.out.println("\n✔ Cartão criado com sucesso!");

                    } else {
                        System.out.println("\n❌ Erro: Não é possivel solicitar este tipo de cartão!");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("VOLTANDO...");
                    break;
                default:
                    System.out.println("Opção Inválida. ");

            }

        }while(opcao!=0);

    }



    private static String formatoCpf(Scanner sc) {
        String cpfU;
        while (true) {
            System.out.print("\nInforme o CPF " + "(formato 000.000.000-00): ");
            cpfU = sc.nextLine();
            if (cpfU.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                break;
            } else {
                System.out.println("\n❌ Formato inválido! Tente novamente!\n");
            }
        }
        return cpfU;

    }

    private static int buscarUsuario(String cpf, List<Usuario> listaUsuarios) {
        int i = 0;
        for (Usuario u : listaUsuarios) {
            if (u.getCpf().equalsIgnoreCase(cpf)) {
                return i;
            }
            i++;
        }
        return -1;
    }











}
