import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos 3 números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        // Cálculo do maior número
        double maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        // Cálculo do menor número
        double menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Cálculo da média
        double media = (num1 + num2 + num3) / 3.0;

        // Saída formatada
        System.out.printf("Maior número: %.2f\n", maior);
        System.out.printf("Menor número: %.2f\n", menor);
        System.out.printf("Média: %.2f\n", media);

        scanner.close();
    }
}