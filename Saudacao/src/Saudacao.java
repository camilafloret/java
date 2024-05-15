import java.util.Scanner; // É uma declaração de importação em Java que permite o uso de classes e interfaces do pacote java.util

public class Saudacao {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira seu nome
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine(); // Ele é usado para ler a entrada do usuário até que uma quebra de linha seja encontrada

        // Exibe uma saudação com o nome fornecido pelo usuário
        System.out.println("Ola, " + nome + "! Bem-vindo(a) ao meu programa Java.");
        
        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}