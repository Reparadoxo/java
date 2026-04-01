package Example1;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 22;
        p1.altura = 1.72f;
        p1.apresentar();

        Pessoa p2 = new Pessoa();
        p2.nome = "Felipe";
        p2.idade = 22;
        p2.altura = 1.85f;
        p2.apresentar();
    }
}
