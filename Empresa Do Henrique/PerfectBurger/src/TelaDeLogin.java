import java.awt.*;
import javax.swing.*;

public class TelaDeLogin extends JFrame {

    public TelaDeLogin()  {
        // Configurações da tela de login
        setTitle("Tela De Login");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Definindo o layout da tela como GridLayout (5 linhas, 2 colunas)
        setLayout(new GridLayout(5, 2, 10, 10));

        // Criando os componentes
        JLabel teladeloginLabel = new JLabel("Tela De Login", JLabel.CENTER);  // JLabel centralizado
        JLabel loginLabel = new JLabel("Login:");
        JTextField loginInput = new JTextField();
        JLabel senhaLabel = new JLabel("Senha:");
        JPasswordField senhaInput = new JPasswordField();
        JCheckBox termosCheckBox = new JCheckBox("Aceite os termos");
        JButton loginButton = new JButton("Login");
        JButton cadastroButton = new JButton("Cadastro");

        // Adicionando os componentes ao GridLayout
        add(teladeloginLabel);          // Primeira linha inteira para o título
        add(new JLabel());         // Espaço vazio para a segunda coluna
        add(loginLabel);
        add(loginInput);
        add(senhaLabel);
        add(senhaInput);
        add(termosCheckBox);
        add(new JLabel());         // Espaço vazio para alinhar a checkbox
        add(loginButton);
        add(cadastroButton);

        // Tornar a tela visível
        setVisible(true);

    
    }

    public static void main(String[] args) {
        // Criar e exibir a tela de login
        new TelaDeLogin();
    }
}