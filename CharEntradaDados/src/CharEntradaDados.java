import java.util.Scanner;

public class CharEntradaDados {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário que insira o caractere
        System.out.print("Digite o caractere: ");
        char letra = scanner.next().charAt(0); // Lê o primeiro caractere da entrada fornecida pelo usuário

        // Exibindo o caractere digitado pelo usuário
        System.out.println("O caractere digitado foi: " + letra);

        // Podemos fazer operações com char
        char proximaLetra = (char) (letra + 1);

        // Imprimindo a próxima letra
        System.out.println("A proxima letra e: " + proximaLetra);
    }    
}