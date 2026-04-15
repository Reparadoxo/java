package function;

import java.util.Scanner;
public class MediaMovel {
    public static float[] mediaMovel (float[] vetorX, int y) {
        int n = vetorX.length; //Inicializo uma variável "n" que pega o tamanho do vetor de dados X
        float[] resultado = new float[n - y + 1]; //Crio uma lista float quer tem tamanho máximo de n - y (+ 1 para não quebrar)
        for (int i = 0; i <= n - y; i ++) {
            float soma = 0; //Declaro uma variável soma para posteriormente fazer a média

            for (int j = 0; j < y; j++) {
                soma += vetorX[i + j]; // Crio o for de variável j para pegarmos os números consecutivos da janela e atribuo à soma.

            }
            resultado[i] = soma / y; //O novo vetor resultado no índice (i) recebe o valor da média móvel
        }
        return resultado; //Retorno da lista
    }

    void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a janela(y) da média móvel.");
        int Tam = 6;
        int y = scanner.nextInt();
        float[] vetorX = new float[Tam];

        System.out.println("Digite os números do vetor X: ");
        for (int i = 0; i < Tam; i++) {
            System.out.printf("Posição %d: ", i);
            vetorX[i] = scanner.nextFloat();
        }

        float[] resultado = mediaMovel(vetorX, y);

        System.out.println("Os resultados são: ");
        for (float media : resultado) {
            System.out.print(media + " ");
        }
        scanner.close();
    }
}
