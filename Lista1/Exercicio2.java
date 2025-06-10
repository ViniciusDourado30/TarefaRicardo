import java.util.Scanner;

public class AnalisadorMatriz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Encontrando o Maior e Menor Valor em uma Matriz");
        
        System.out.print("\nPrimeiro, informe o número de linhas: ");
        int linhas = leitor.nextInt();

        System.out.print("Agora, informe o número de colunas: ");
        int colunas = leitor.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("\nPreencha a matriz com números inteiros.");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = leitor.nextInt();
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nAnálise Concluída");
        System.out.println("O maior elemento encontrado na matriz é: " + maior);
        System.out.println("O menor elemento encontrado na matriz é: " + menor);

        leitor.close();
    }
}