import java.util.Scanner;

public class Calculadora {

    public double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public double subtrair(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double dividir(double numeroUm, double numeroDois) {
        return numeroUm / numeroDois;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calculadora minhaCalculadora = new Calculadora();

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = leitor.nextDouble();

        System.out.println("Digite o segundo número?");
        double segundoNumero = leitor.nextDouble();

        System.out.println("Escolha uma ação?");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int escolha = leitor.nextInt();

        double resultado = 0;

        if (escolha == 1) {
            resultado = minhaCalculadora.somar(primeiroNumero, segundoNumero);
        } else if (escolha == 2) {
            resultado = minhaCalculadora.subtrair(primeiroNumero, segundoNumero);
        } else if (escolha == 3) {
            resultado = minhaCalculadora.multiplicar(primeiroNumero, segundoNumero);
        } else if (escolha == 4) {
            resultado = minhaCalculadora.dividir(primeiroNumero, segundoNumero);
        } else {
            System.out.println("Opção inválida, que pena.");
            leitor.close();
            return;
        }

        System.out.println("O resultado da sua operação é: " + resultado);

        leitor.close();
    }
}