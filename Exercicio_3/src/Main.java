import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.print("Segundo valor: ");
        int num2 = sc.nextInt();

        System.out.print("Terceiro valor: ");
        int num3 = sc.nextInt();

        int menor = num1;
        if(num2 < menor){
            menor = num2;
        }
        if (num3 < menor){
            menor = num3;
        }

        System.out.println("MENOR = " + menor);

        sc.close();
    }
}
