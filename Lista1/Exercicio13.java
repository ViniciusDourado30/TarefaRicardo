import java.util.Scanner;

public class CalculadoraFatorial {

    public long calcularFatorial(int numero) {

        if (numero == 0) {
            return 1;
        }
        
        return numero * calcularFatorial(numero - 1);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculadoraFatorial calculadora = new CalculadoraFatorial();

        System.out.println("Calcular o fatorial de um número.");
        System.out.print("Por favor, digite um número inteiro que não seja negativo: ");
        
        int numeroDoUsuario = leitor.nextInt();

        if (numeroDoUsuario < 0) {
            System.out.println("Não é possível calcular o fatorial de números negativos.");
        } else {

            long resultado = calculadora.calcularFatorial(numeroDoUsuario);
            System.out.println("O fatorial de " + numeroDoUsuario + " é: " + resultado);
        }

        leitor.close();
    }
}