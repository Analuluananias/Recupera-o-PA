import javax.swing.JOptionPane;

public class Exe11 {
    public static void main(String[] args) {

        //Criando o menu e pedindo a opção
        JOptionPane.showMessageDialog(null,"MENU");
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
            "1 - Cadastrar\n2 - Login\n3 - Sair"));

        //Verificando a opção
        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, "Cadastrar");
        } else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, "Login efetuado");
        } else if (opcao == 3) {
            JOptionPane.showMessageDialog(null, "Sair");
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
