package function;
import java.util.*;

public class Desconto {

    public static void processo(Scanner scanner, float desconto){
        String nome;
        float preco;
        System.out.println("Digite o nome do produto: ");
        nome = scanner.next();
        System.out.println("Digite o preço do produto: ");
        preco = scanner.nextFloat();
        System.out.printf("Você comprou um produto (%s) por R$ %.0f e acaba de ganhar um desconto de %.0f %%.\n" +
                "Assim você vai pagar apenas R$ %.2f pelo seu produto." +
                "Volte sempre!", nome, preco, desconto * 100, preco - (preco * desconto));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float desconto = 0.1f;
        processo(scanner, desconto);
    }
}
