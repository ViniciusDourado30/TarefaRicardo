package ex5_sequencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Terreno");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Idades");
            System.out.println("4 - Soma");
            System.out.println("5 - Troco");
            System.out.println("6 - Círculo");
            System.out.println("7 - Pagamento");
            System.out.println("8 - Consumo");
            System.out.println("9 - Medidas");
            System.out.println("10 - Duração");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao) {
                case 1:
                    Terreno.executar(sc);
                    break;
                case 2:
                    Retangulo.executar(sc);
                    break;
                case 3:
                    Idades.executar(sc);
                    break;
                case 4:
                    Soma.executar(sc);
                    break;
                case 5:
                    Troco.executar(sc);
                    break;
                case 6:
                    Circulo.executar(sc);
                    break;
                case 7:
                    Pagamento.executar(sc);
                    break;
                case 8:
                    Consumo.executar(sc);
                    break;
                case 9:
                    Medidas.executar(sc);
                    break;
                case 10:
                    Duracao.executar(sc);
                    break;
                case 0:
                    System.out.println("Encerrando Exercício 2.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
        sc.close();
    }
}