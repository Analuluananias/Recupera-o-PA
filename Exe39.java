import javax.swing.JOptionPane;

public class Exe39 {
    public static void main(String[] args) {

        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA LOGIN E SENHA");

        //Login e senha esperados
        String loginCorreto = "admin";
        String senhaCorreta = "1234";

        String login, senha;

        //Verificando até acertar ambos
        do {
            login = JOptionPane.showInputDialog("Digite o login:");
            senha = JOptionPane.showInputDialog("Digite a senha:");
        } while (!login.equals(loginCorreto) && !senha.equals(senhaCorreta));

        JOptionPane.showMessageDialog(null, "Acesso autorizado!");
    }
}
