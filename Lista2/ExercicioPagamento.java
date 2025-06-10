package ex5_sequencial;

import java.util.Scanner;

public class Pagamento {
        public static void executar(Scanner sc) {
        sc.nextLine(); 
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int horas = sc.nextInt();
        double pagamento = valorHora * horas;
        System.out.printf("O pagamento para %s deve ser %.2f%n", nome, pagamento);
    }
}
