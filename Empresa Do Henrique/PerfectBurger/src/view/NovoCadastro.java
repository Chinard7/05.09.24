import java.awt.*;
import javax.swing.*;

public class NovoCadastro extends JFrame {

    public NovoCadastro()  {
        // Configurações da tela de Cadastro
        setTitle("Tela De Cadastro");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout do Cadastro
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os componentes
        gbc.anchor = GridBagConstraints.WEST; // Alinhar os componentes à esquerda
        
        // Componente GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Insira Seu Nome De Usuário"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Insira Seu Email"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Insira Sua Senha"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(new JPasswordField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Confirme Sua Senha"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(new JPasswordField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2; // Ocupa duas colunas
        add(new JCheckBox("Aceito Os Termos"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2; // Ocupa duas colunas
        gbc.anchor = GridBagConstraints.CENTER; // Alinhar o botão ao centro
        add(new JButton("Cadastrar-se"), gbc);

        setVisible(true); // Tornar a janela visível
    }

    public static void main(String[] args) {
        // Criar e exibir a tela de cadastro
        new NovoCadastro();
    }
}