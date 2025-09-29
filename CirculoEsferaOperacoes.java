import java.util.Scanner;

public class CirculoEsferaOperacoes {

    public static void main(String[] args) {
        final double PI = 3.141592;
        Scanner scanner = new Scanner(System.in);

        // Entrada do código da operação
        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int operacao = scanner.nextInt();

        // Entrada do raio
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double resultado;

        // Verifica a operação e realiza o cálculo correspondente
        switch (operacao) {
            case 1:
                resultado = 2 * PI * raio;
                System.out.printf("Perímetro do círculo: %.6f\n", resultado);
                break;
            case 2:
                resultado = PI * raio * raio;
                System.out.printf("Área do círculo: %.6f\n", resultado);
                break;
            case 3:
                resultado = (4.0 / 3.0) * PI * Math.pow(raio, 3);
                System.out.printf("Volume da esfera: %.6f\n", resultado);
                break;
            default:
                System.out.println("Código de operação inválido.");
                break;
        }

        scanner.close();
    }
}