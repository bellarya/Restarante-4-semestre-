import javax.swing.*;

public class TelaPrincipal extends JFrame{
    public static void telaPrincipal(JFrame telaPrincipal) {

        telaPrincipal.setTitle("Tela Principal");
        telaPrincipal.setSize(400, 300);
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaPrincipal.setLocationRelativeTo(null); // Centraliza a janela na tela
        telaPrincipal.setLayout(null);
        telaPrincipal.setVisible(true);

        JButton botaoCadastro = new JButton("Cadastro");
        telaPrincipal.add(botaoCadastro);
        botaoCadastro.setBounds(50, 50, 100, 30);



    }
}