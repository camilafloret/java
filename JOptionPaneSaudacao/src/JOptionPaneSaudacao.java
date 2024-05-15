import javax.swing.JOptionPane;

public class JOptionPaneSaudacao {
    public static void main(String[] args) {
        // Exibir uma caixa de diálogo de entrada para obter o nome do usuário
        String nome = JOptionPane.showInputDialog("Por favor, digite seu nome: ");

        // Exibir uma mensagem de boas-vindas
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! em-vindo(a) ao meu programa Java.");
    }
}