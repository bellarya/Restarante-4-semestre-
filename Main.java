import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        telaLogin.setTitle("Tela de Login");
        telaLogin.setSize(300, 200);
        telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaLogin.setLocationRelativeTo(null); // Centraliza a janela na tela
        telaLogin.setLayout(null);

        TelaLogin.telaLogin(telaLogin);
    }
}