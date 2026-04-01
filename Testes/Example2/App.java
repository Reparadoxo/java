package Example2;
import java.util.*;
public class App {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int valor;
    ContaBancaria pessoa1 = new ContaBancaria();
    pessoa1.titular = "Francisco";
    pessoa1.status();
    do {
      System.out.println("Digite o valor que queira depositar ou retirar(Digite 0 para sair):");
      valor = scanner.nextInt();
      if (valor != 0) {
        if (valor > 0) {
          pessoa1.depositar(valor);
        } else{
          pessoa1.sacar(valor);
        }
      } else{
        System.out.println("Saindo do programa. Obrigado pelo seu uso.");
      }
    } while (valor != 0);
    pessoa1.status();

    scanner.close();
  }
}
