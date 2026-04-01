package Example2;

public class ContaBancaria {
    String titular;
    float saldo = 0;

    public void status(){
        System.out.println("O seu saldo é " + this.saldo);
    }

    public void depositar(float valor){
        this.saldo += valor;
    }

    public void sacar(float valor){
        if ((valor*-1) > this.saldo) {
            System.out.println("Você não pode emprestar mais do que tem no banco seu vagabundo. Vai trabalhar");
        } else {
            saldo = saldo - (valor*-1);
        }
    }
}
