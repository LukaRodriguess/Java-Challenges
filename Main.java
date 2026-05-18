import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.print("Digite um número: ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println("Número inválido. Digite apenas números inteiros.");
                scanner.next(); // limpa o texto inválido
            }
        }

        if (numero % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }

        scanner.close();
    }
}