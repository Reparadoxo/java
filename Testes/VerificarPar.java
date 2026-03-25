import java.util.*;

public class VerificarPar {

    public static String verificar(int num) {
        if (num % 2 == 0){
            return "O número é par.";
        } else {
            return "O número é ímpar";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite um número para verificar se ele é par ou impar");
        num = scanner.nextInt();
        System.out.println(verificar(num));
    }
}
