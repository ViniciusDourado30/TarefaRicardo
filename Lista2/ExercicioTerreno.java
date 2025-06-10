package ex5_sequencial;

import java.util.Scanner;

public class Terreno {
        public static void executar(Scanner sc) {
        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        double valorM2 = sc.nextDouble();
        double area = largura * comprimento;
        double preco = area * valorM2;
        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preco do terreno = %.2f%n", preco);
    }
}
