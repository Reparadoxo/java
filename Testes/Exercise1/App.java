package Exercise1;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto p1 = new Produto("Notebook", 2500.0, 10);

        System.out.println("Produto: " + p1.getNome() + "\nPreço Unitário: " + p1.getPreco() + "\nQuantidade: " + p1.getQuantidade());
        System.out.println("Valor total: " + p1.valorTotalEstoque());
        p1.adicionarEstoque(5);
        p1.removerEstoque(3);
        p1.adicionarEstoque(-5);

        System.out.println("Produto: " + p1.getNome() + "\nPreço Unitário: " + p1.getPreco() + "\nQuantidade: " + p1.getQuantidade());
        System.out.println("Quantidade atual: " + p1.getQuantidade());
    }
}
