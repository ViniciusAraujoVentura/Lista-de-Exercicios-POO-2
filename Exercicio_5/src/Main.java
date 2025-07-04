import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double recebido = sc.nextDouble();

        double total = preco * quantidade;

        if (recebido >= total) {
            double troco = recebido - total;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double faltando = total - recebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", faltando);
        }

        sc.close();
    }
}
