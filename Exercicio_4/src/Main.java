import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int min = sc.nextInt();

       double valorBase = 50.00;
       int franquia = 100;
       double valorExcedentePorMinuto = 2.00;
       double valorFinal;

        if (min <= franquia) {
            valorFinal = valorBase;
        } else {
            int minutosExcedentes = min - franquia;
            valorFinal = valorBase + minutosExcedentes * valorExcedentePorMinuto;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
