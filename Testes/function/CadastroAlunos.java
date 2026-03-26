package function;

import java.util.*;

public class CadastroAlunos {
    public static void menu(){
        System.out.println("\n===== MENU =====\n" +
                "[1] Adicionar aluno\n" +
                "[2] Listar alunos\n" +
                "[3] Buscar aluno\n" +
                "[4] Remover aluno\n" +
                "[5] Sair");
    }

    public static void adicionarAluno(Scanner scanner, ArrayList<String> alunos) {
        System.out.println("Digite o nome do aluno a ser adicionado: ");
        alunos.add(scanner.next());
        System.out.println("Aluno adicionado com sucesso!");
    }

    public static void mostrarAlunos(ArrayList<String> alunos) {
        int index = 0;
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado");
        } else {
            Collections.sort(alunos);
            for (String aluno : alunos) {
                System.out.printf("Aluno" + index + ": " + alunos.get(index) + "\n");
                index++;
            }
        }
    }

    public static void pesquisarAlunos(Scanner scanner, ArrayList<String> alunos) {
        int index = 0;
        System.out.println("Digite o nome do aluno para a busca: ");
        String busca = scanner.next();
        boolean validacao = false;
        for (String aluno : alunos) {
            if (aluno.equalsIgnoreCase(busca)) {
                System.out.printf("Aluno:" + index + " " + alunos.get(index) + " encontrado!");
                validacao = true;
            }
            index++;
        }
        if (validacao == false) {
            System.out.println("Aluno não encontrado");
        }
    }

    public static void removerAlunos(Scanner scanner, ArrayList<String> alunos) {
        int index = 0;
        int aux;
        for (String aluno : alunos){
            System.out.printf("Aluno" + index + ": " + alunos.get(index) + "\n");
            index++;
        }
        System.out.println("Digite o índice do aluno que deseja remover: ");
        aux = scanner.nextInt();
        alunos.remove(aux);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        int opcao;
        do {
            menu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    adicionarAluno(scanner, alunos);
                    break;
                case 2:
                    mostrarAlunos(alunos);
                    break;
                case 3:
                    pesquisarAlunos(scanner, alunos);
                    break;
                case 4:
                    removerAlunos(scanner, alunos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção não encontrada");
            }
        } while (opcao != 5);
        scanner.close();
    }
}
