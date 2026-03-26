package function;
import java.util.*;

public class PrecoProduto {

    public static void cadastrarProduto(String nome, float preco, float troco) {
        System.out.printf("Você comprou o produto (%s) por R$ %f e entregou ao vendedor R$ %f em dinheiro.\n" +
                "Você vai receber R$ %f de troco. Volte sempre!", nome, preco, troco, troco - preco);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String nomeProduto;
        float preco, valorPago;
        System.out.println("Digite o nome do produto: ");
        nomeProduto = scanner.next();
        System.out.println("Digite o preço do produto: ");
        preco = scanner.nextFloat();
        System.out.println("Digite o valor entregue: ");
        valorPago = scanner.nextFloat();
        cadastrarProduto(nomeProduto, preco, valorPago);
        scanner.close();
    }
}
