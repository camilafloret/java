import java.util.Scanner;

public class StringEntradaDados {
    public static void main(String[] args) {  
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira uma string
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        // Imprimir a string inserida pelo usuário
        System.out.println("A string inserida é: " + inputString);

        // Fechar o Scanner
        scanner.close();
    }
}