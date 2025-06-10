import java.util.Scanner;

public class VerificadorDePalindromos {

    public boolean ehPalindromo(String texto) {
        
        String textoFormatado = texto.replaceAll("\\s+", "").toLowerCase();

        String textoInvertido = new StringBuilder(textoFormatado).reverse().toString();

        return textoFormatado.equals(textoInvertido);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        VerificadorDePalindromos verificador = new VerificadorDePalindromos();

        System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
        String entradaDoUsuario = leitor.nextLine();

        if (verificador.ehPalindromo(entradaDoUsuario)) {
            System.out.println(entradaDoUsuario + "' é um palíndromo.");
        } else {
            System.out.println(entradaDoUsuario + "' não é um palíndromo.");
        }

        leitor.close();
    }
}