import javax.swing.JOptionPane;

public class Exe33 {
    public static void main(String[] args) {
        
        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA VERIFICAÇÃO DE SENHA");

        String senha;

        //Laço até a senha estar correta
        do {
            senha = JOptionPane.showInputDialog("Digite a senha:");
        } while (!senha.equals("1234"));

        JOptionPane.showMessageDialog(null, "Acesso autorizado!");
    }
}
