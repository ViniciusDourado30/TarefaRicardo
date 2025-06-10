package ex5_sequencial;

import java.util.Scanner;

public class Medidas {
        public static void executar(Scanner sc) {
        System.out.print("Digite a medida A: ");
        double A = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        double B = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        double C = sc.nextDouble();
        double areaQuadrado = A * A;
        double areaTriangulo = (A * B) / 2;
        double areaTrapezio = ((A + B) * C) / 2;
        System.out.printf("AREA DO QUADRADO = %.4f%n", areaQuadrado);
        System.out.printf("AREA DO TRIANGULO = %.4f%n", areaTriangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", areaTrapezio);
    }
}
