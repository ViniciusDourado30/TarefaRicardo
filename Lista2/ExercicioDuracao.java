package ex5_sequencial;

import java.util.Scanner;

public class Duracao {
        public static void executar(Scanner sc) {
        System.out.print("Digite a duracao em segundos: ");
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segRestantes = segundos % 60;
        System.out.printf("%d:%d:%d%n", horas, minutos, segRestantes);
    }
}
