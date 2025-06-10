package ex5_sequencial;

import java.util.Scanner;

public class Troco {
    public static void executar(Scanner sc) {
        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        double recebido = sc.nextDouble();
        double total = preco * quantidade;
        double troco = recebido - total;
        System.out.printf("TROCO = %.2f%n", troco);
    }
}
