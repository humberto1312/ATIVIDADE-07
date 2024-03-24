import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar 5 números
        System.out.println("Digite 5 números:");

        // Inicializa a variável para armazenar o maior número e lê o primeiro número
        int maiorNumero = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();

            // Verifica se o número digitado é maior que o número máximo atual
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        // Exibe o maior número informado pelo usuário
        System.out.println("O maior número digitado é: " + maiorNumero);

        scanner.close();
    }
}
