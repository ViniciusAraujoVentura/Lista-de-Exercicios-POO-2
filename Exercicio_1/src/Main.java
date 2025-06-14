import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double x = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double y = sc.nextDouble();

        double notaFinal = x + y;
        System.out.println("NOTA FINAL = " + notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
