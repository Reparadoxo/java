import java.util.*;

public class Tabuada {

    public static void tabuada(int num) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d == %d\n", num, i, num * i);
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite o valor para mostrar sua tabuada.");
        num = scanner.nextInt();
        tabuada(num);
        scanner.close();
    }
}
