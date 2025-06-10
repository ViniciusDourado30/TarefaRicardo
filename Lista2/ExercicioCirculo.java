package ex5_sequencial;

import java.util.Scanner;

public class Circulo {
        public static void executar(Scanner sc) {
        System.out.print("Digite o valor do raio do círculo: ");
        double r = sc.nextDouble();
        double area = 3.14159 * r * r;
        System.out.printf("AREA = %.3f%n", area);
    }
}
