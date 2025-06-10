package ex5_sequencial;

import java.util.Scanner;

public class Consumo {
        public static void executar(Scanner sc) {
        System.out.print("Distancia percorrida: ");
        double distancia = sc.nextDouble();
        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();
        double consumo = distancia / combustivel;
        System.out.printf("Consumo medio = %.3f%n", consumo);
    }
}
