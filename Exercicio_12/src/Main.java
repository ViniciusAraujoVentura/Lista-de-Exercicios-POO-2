import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial == horaFinal) {
            duracao = 24;
        } else if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}
