import java.util.Scanner;

public class ValorContainer {

    int valor;

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        System.out.println("Iniciando a troca.");

        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
        
        System.out.println("Troca finalizada dentro do método.");
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();

        System.out.print("Digite o valor inicial para o Objeto A: ");
        objA.valor = leitor.nextInt();

        System.out.print("Digite o valor inicial para o Objeto B: ");
        objB.valor = leitor.nextInt();

        System.out.println("\nValores Antes da Troca");
        System.out.println("Objeto A tem o valor: " + objA.valor);
        System.out.println("Objeto B tem o valor: " + objB.valor);

        trocarValores(objA, objB);

        System.out.println("\nValores Depois da Troca (de volta no main)");
        System.out.println("Agora, Objeto A tem o valor: " + objA.valor);
        System.out.println("Agora, Objeto B tem o valor: " + objB.valor);

        leitor.close();
    }
}