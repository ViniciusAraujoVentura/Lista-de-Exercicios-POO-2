import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        double maior = d1;
        if (d2 > maior) {
            maior = d2;
        }
        if (d3 > maior) {
            maior = d3;
        }

        System.out.printf("MAIOR DISTANCIA = %.2f%n", maior);

        sc.close();
    }
}
