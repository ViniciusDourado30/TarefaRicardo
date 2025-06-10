import java.util.Scanner;

public class SomaDiagonais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Soma das Diagonais de uma Matriz Quadrada");
        System.out.print("\nInforme a ordem da matriz (ex: 3 para 3x3): ");
        int n = leitor.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("\nAgora, preencha a matriz com números inteiros.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = leitor.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][n - 1 - i];
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Soma da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaSecundaria);

        leitor.close();
    }
}