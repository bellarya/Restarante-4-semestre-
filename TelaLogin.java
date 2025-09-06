import javax.swing.*;

public class TelaLogin extends JFrame {
    public static void telaLogin(JFrame telaLogin) {

        telaLogin.setTitle("Tela de Login");
        telaLogin.setSize(300, 200);
        telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaLogin.setLocationRelativeTo(null); // Centraliza a janela na tela
        telaLogin.setLayout(null);

        JLabel txtUsuario = new JLabel("Usuário:");
        telaLogin.add(txtUsuario);
        txtUsuario.setBounds(50, 30, 80, 25);
        
        JLabel txtSenha = new JLabel("Senha:");
        telaLogin.add(txtSenha);
        txtSenha.setBounds(50, 70, 80, 25);

        JTextField campoUsuario = new JTextField(15);
        telaLogin.add(campoUsuario);
        campoUsuario.setBounds(150, 30, 100, 25);

        JPasswordField campoSenha = new JPasswordField(15);
        telaLogin.add(campoSenha);
        campoSenha.setBounds(150, 70, 100, 25);

        JButton btnLogin = new JButton("Login");
        telaLogin.add(btnLogin);
        btnLogin.setBounds(50, 110, 80, 25);

        JButton btnCancelar = new JButton("Cancelar");
        telaLogin.add(btnCancelar);
        btnCancelar.setBounds(150, 110, 100, 25);
        btnCancelar.addActionListener(evento -> System.exit(0));

        btnLogin.addActionListener(evento -> {
            String usuario = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword());
            if (usuario.equals("admin") && senha.equals("1234")) {
                JOptionPane.showMessageDialog(telaLogin, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                telaLogin.dispose(); // Fecha a tela de login
                
                TelaPrincipal.telaPrincipal(telaPrincipal);

            } else {
                JOptionPane.showMessageDialog(telaLogin, "Usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
