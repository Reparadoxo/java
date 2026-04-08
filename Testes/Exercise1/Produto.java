package Exercise1;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço do produto não pode ser negativo ou zero.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("A quantidade do produto não pode ser negativo.");
        }
    }

    public double valorTotalEstoque(){
        return this.preco * this.quantidade;
    }

    public void adicionarEstoque(int num){
        if (num > 0) {
            this.quantidade += num;
        } else {
            System.out.println("A quantidade adicionada tem que ser maior que 0.");
        }
    }

    public void removerEstoque(int num){
        if (num > 0) {
            this.quantidade -= num;
        } else {
            System.out.println("A quantidade removida tem que ser maior que 0.");
        }
    }
}
