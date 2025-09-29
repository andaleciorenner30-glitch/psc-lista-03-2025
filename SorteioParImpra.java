import java.util.Scanner;
import java.util.Random;

public class SorteioParImpra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Entrada dos dois números inteiros
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Determina o menor e o maior número
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // Gera número aleatório entre menor e maior (inclusive)
        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        // Verifica se é par ou ímpar
        if (numeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + numeroSorteado + " - Par");
        } else {
            System.out.println("Número sorteado: " + numeroSorteado + " - Ímpar");
        }

        scanner.close();
    }
}