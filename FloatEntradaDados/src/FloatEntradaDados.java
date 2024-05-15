import java.util.Scanner;

public class FloatEntradaDados {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o número
        System.out.print("Digite um nemero flutuante: ");
        float numeroFloat = Float.parseFloat(scanner.nextLine()); // Float ocupa apenas 32 bits

        // Imprimir o numero inserido pelo usuário
        System.out.println("Você digitou: " + numeroFloat);

        // Fechar o Scanner
        scanner.close();
    }
}