import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        String classificacao;
        if (glicose <= 100.0) {
            classificacao = "normal";
        } else if (glicose <= 140.0) {
            classificacao = "elevado";
        } else {
            classificacao = "diabetes";
        }

        System.out.println("Classificacao: " + classificacao);

        sc.close();
    }
}
