import javax.swing.JOptionPane;

public class Exe47 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"VALIDAÇÃO DE SENHA");

         //Variáveis
        String senhaCorreta = "1234";
        String senhaDigitada;
        int tentativas = 0;
        
        //Laço de tentativas
        do {
            senhaDigitada = JOptionPane.showInputDialog("Digite a senha:");
            tentativas++;

            if (senhaDigitada.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta. Tentativa " + tentativas + " de 3.");
            }

        } while (tentativas < 3);

        //Mensagem se não acertar
        if (!senhaDigitada.equals(senhaCorreta)) {
            JOptionPane.showMessageDialog(null, "Número de tentativas excedido.");
        }
    }
}
