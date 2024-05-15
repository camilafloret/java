import java.util.Scanner;

public class DecimalInteiroEntradaDados {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número inteiro
        System.out.print("Digite um nemero inteiro: ");
        int numeroInteiro = scanner.nextInt();

        // Solicitar ao usuário que insira um número decimal
        System.out.print("Digite um nemero decimal: ");
        double numeroDecimal = scanner.nextDouble(); // Double ocupa 64 bits na memória

        // Imprimir os números inseridos pelo usuário
        System.out.println("O numero inteiro inserido e: " + numeroInteiro);
        System.out.println("O numero decimal inserido e: " + numeroDecimal);

        // Fechar o Scanner
        scanner.close();
    }
}