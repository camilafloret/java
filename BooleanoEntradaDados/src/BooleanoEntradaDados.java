import java.util.Scanner;

public class BooleanoEntradaDados {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira verdadeiro ou falso
        System.out.print("Digite true ou false: ");
        boolean entradaBooleana = Boolean.parseBoolean(scanner.nextLine());

        // Imprimir o valor booleano inserido pelo usuário
        System.out.println("Você digitou: " + entradaBooleana);

        // Fechar o Scanner
        scanner.close();
    }
}