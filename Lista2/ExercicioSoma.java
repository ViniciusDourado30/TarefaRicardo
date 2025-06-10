package ex5_sequencial;

import java.util.Scanner;

public class Soma {
    public static void executar(Scanner sc) {
        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = sc.nextInt();
        int soma = x + y;
        System.out.println("SOMA = " + soma);
    }
}
