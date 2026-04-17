package Exercise3;

import java.util.*;

public class App {

    public static void menu(Scanner scanner, ArrayList<ListaTelefonica> listaTelefones) {
        while (true) {
            int opcao;
            System.out.println("""
                    ======= AGENDA =======
                    [1] Adicionar contato
                    [2] Editar contato
                    [3] Excluir contato
                    [4] Listar contatos
                    [5] Sair""");

            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao != 5) {
                switch (opcao) {
                    case 1:
                        /*Adicionar Contatos*/
                        adicionarContato(scanner, listaTelefones);
                        break;
                    case 2:
                        /*Editar contatos*/
                        menuEditar(scanner, listaTelefones);
                        break;
                    case 3:
                        /*Excluir contatos*/
                        removerContato(scanner, listaTelefones);
                        break;
                    case 4:
                        /*Listar contatos*/
                        listarContatos(listaTelefones);
                        break;
                }
            } else {break;}
        }
    }

    /*Adicionar Contatos*/
    public static void adicionarContato(Scanner scanner, ArrayList<ListaTelefonica> listaTelefones){
        System.out.println("Digite o nome do seu contato: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o número do seu telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite o e-mail do seu contato");
        String email = scanner.nextLine();
        listaTelefones.add(new ListaTelefonica(nome, telefone, email));
        System.out.println("Contato adicionado com sucesso.");
    }

    /*Editar contatos*/
    public static void menuEditar(Scanner scanner, ArrayList<ListaTelefonica> listaTelefones){
        while (true) {
            int opcaoEditar;
            System.out.println("""
                    === EDITAR CONTATO ===
                    [1] Editar telefone
                    [2] Editar email
                    [3] Voltar
                    """);
            System.out.println("Escolha uma opção:");
            opcaoEditar = scanner.nextInt();
            scanner.nextLine();
            if (opcaoEditar != 3){
                switch (opcaoEditar){
                    case 1:
                        /*Editar Nome*/
                        boolean encontradoNome = false;
                        System.out.printf("\n%-20s | %-10s | %-30s\n", "Nome", "Telefone", "Email");
                        for (ListaTelefonica listaTelefone : listaTelefones) {
                            System.out.printf("\n%-20s | %-10s | %-30s\n",
                                    listaTelefone.getNome(), listaTelefone.getTelefone(), listaTelefone.getEmail());
                        }

                        System.out.println("Digite o nome do contato que deseja alterar o nome: ");
                        String buscaNome = scanner.nextLine();
                        scanner.nextLine();
                        for (ListaTelefonica listaTelefone : listaTelefones) {
                            if (listaTelefone.getNome().equalsIgnoreCase(buscaNome)) {
                                System.out.print("Digite o novo nome do contato: ");
                                String novoNome = scanner.nextLine();
                                listaTelefone.setNome(novoNome);
                                encontradoNome = true;
                            }
                        }

                        if (!encontradoNome) {
                            System.out.println("O nome do contato não foi encontrado");
                        }
                        break;
                    case 2:
                        /*Editar email*/
                        boolean encontradoEmail = false;
                        System.out.printf("\n%-20s | %-10s | %-30s\n", "Nome", "Telefone", "Email");
                        for (ListaTelefonica listaTelefone : listaTelefones) {
                            System.out.printf("\n%-20s | %-10s | %-30s\n",
                                    listaTelefone.getNome(), listaTelefone.getTelefone(), listaTelefone.getEmail());
                        }
                        System.out.println("Digite o nome do contato que deseja alterar o email: ");
                        String buscaEmail = scanner.nextLine();
                        scanner.nextLine();
                        for (ListaTelefonica listaTelefone : listaTelefones) {
                            if (listaTelefone.getNome().equalsIgnoreCase(buscaEmail)) {
                                System.out.print("Digite o novo email do contato: ");
                                String novoEmail = scanner.nextLine();
                                listaTelefone.setEmail(novoEmail);
                                encontradoEmail = true;
                            }
                        }

                        if (!encontradoEmail) {
                            System.out.println("O nome do contato não foi encontrado");
                        }
                        break;
                    default:
                        System.out.println("Número fora de escopo ou símbolo não reconhecido.");
                }
                scanner.nextLine();
            } else {break;}
        }
    }

    /*Excluir contatos*/
    public static void removerContato(Scanner scanner, ArrayList<ListaTelefonica> listaTelefones) {
        if (listaTelefones.isEmpty()) {
            System.out.println("A lista não tem nenhum contato cadastrado.");
            return;
        }

        listaTelefones.sort(Comparator.comparing(ListaTelefonica::getNome));
        System.out.printf("\n%-20s | %-10s | %-30s\n", "Nome", "Telefone", "Email");
        for (ListaTelefonica listaTelefone : listaTelefones) {
            System.out.printf("\n%-20s | %-10s | %-30s\n",
                    listaTelefone.getNome(), listaTelefone.getTelefone(), listaTelefone.getEmail());
        }

        System.out.println("Digite o nome do contato que deseja excluir: ");
        String busca = scanner.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < listaTelefones.size(); i++) {
            if (listaTelefones.get(i).getNome().equalsIgnoreCase(busca)) {
                //noinspection SuspiciousListRemoveInLoop
                listaTelefones.remove(i);
                System.out.println("Contato removido da lista.");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("O contato não foi encontrado na lista.");
        }
        scanner.nextLine();
    }

    /*Listar contatos*/
    public static void listarContatos(ArrayList<ListaTelefonica> listaTelefones){
        if (listaTelefones.isEmpty()) {
            System.out.println("A lista não tem nenhum contato cadastrado.");
            return;
        }

        listaTelefones.sort(Comparator.comparing(ListaTelefonica::getNome));
        System.out.printf("\n%-20s | %-10s | %-30s\n", "Nome", "Telefone", "Email");
        for (ListaTelefonica listaTelefone : listaTelefones) {
            System.out.printf("\n%-20s | %-10s | %-30s\n",
                    listaTelefone.getNome(), listaTelefone.getTelefone(), listaTelefone.getEmail());
        }
    }

    /*Main*/
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ListaTelefonica> listaTelefones = new ArrayList<>();
        menu(scanner, listaTelefones);
        scanner.close();
    }
}
