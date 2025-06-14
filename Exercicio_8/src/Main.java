import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().toUpperCase().charAt(0);  // Lê 'C' ou 'F' (aceita minúsculas também)

        double temperatura, resultado;

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = sc.nextDouble();
            resultado = (5.0 / 9.0) * (temperatura - 32.0);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", resultado);
        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();
            resultado = (temperatura * 9.0 / 5.0) + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", resultado);
        } else {
            System.out.println("Escala invalida. Use apenas C ou F.");
        }

        sc.close();
    }
}
