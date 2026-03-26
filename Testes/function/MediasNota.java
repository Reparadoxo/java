package function;
import java.util.*;

public class MediasNota {

    public static void media(String tipo, float nota1, float nota2, float nota3) {
        if (tipo.equals("A") || tipo.equals("a")) {
            System.out.printf("A média aritmética do aluno é: %.2f", (nota1 + nota2 + nota3) / 3);
        } else if(tipo.equals("P") || tipo.equals("p")) {
            System.out.printf("A média ponderada do aluno é: %.2f", ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / (5 + 3 + 2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipo;
        float nota1, nota2, nota3;
        System.out.println("Digite qual a média que deve ser aplicada as notas dos alunos (A - Aritmetica, P - Ponderada)");
        tipo = scanner.next();
        System.out.println("Digite o valor da primeira nota do aluno: ");
        nota1 = scanner.nextFloat();
        System.out.println("Digite o valor da segunda nota do aluno: ");
        nota2 = scanner.nextFloat();
        System.out.println("Digite o valor da terceira nota do aluno: ");
        nota3 = scanner.nextFloat();
        media(tipo, nota1, nota2, nota3);
    }
}
