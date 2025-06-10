import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorTemperatura {

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();
        DecimalFormat formatador = new DecimalFormat("#.##");

        System.out.println("Escolha a conversão que deseja realizar:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");
        int escolha = leitor.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em graus Celsius: ");
            double tempCelsius = leitor.nextDouble();
            double tempFahrenheit = conversor.celsiusParaFahrenheit(tempCelsius);
            System.out.println("O resultado é: " + formatador.format(tempFahrenheit) + " °F");

        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em graus Fahrenheit: ");
            double tempFahrenheit = leitor.nextDouble();
            double tempCelsius = conversor.fahrenheitParaCelsius(tempFahrenheit);
            System.out.println("O resultado é: " + formatador.format(tempCelsius) + " °C");

        } else {
            System.out.println("Opção inválida.");
        }

        leitor.close();
    }
}