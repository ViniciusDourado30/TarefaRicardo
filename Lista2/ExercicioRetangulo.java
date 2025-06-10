package ex5_sequencial;

import java.util.Scanner;

public class Retangulo {
    public static void executar(Scanner sc) {
        System.out.print("Base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(base * base + altura * altura);
        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);
    }
}