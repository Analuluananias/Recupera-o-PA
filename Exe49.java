import javax.swing.JOptionPane;

public class Exe49 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"SISTEMA DE LOGIN");

         //Variáveis
        String loginCorreto = "admin";
        String senhaCorreta = "1234";
        String loginDigitado, senhaDigitada;
        int tentativas = 0;

        //Laço para validar login e senha
        do {
            loginDigitado = JOptionPane.showInputDialog("Digite o login:");
            senhaDigitada = JOptionPane.showInputDialog("Digite a senha:");
            tentativas++;

            if (loginDigitado.equals(loginCorreto) && senhaDigitada.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tentativa " + tentativas + " de 3.");
            }

        } while (tentativas < 3);

        //Mensagem de falha se não conseguir logar
        if (!(loginDigitado.equals(loginCorreto) && senhaDigitada.equals(senhaCorreta))) {
            JOptionPane.showMessageDialog(null, "Número de tentativas excedido.");
        }
    }
}
