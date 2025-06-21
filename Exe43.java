import javax.swing.JOptionPane;

public class Exe43 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"MENU DE OPÇÕES");

        //Variável
        int opcao;

        //Laço do menu
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar\n2 - Listar\n3 - Editar\n0 - Sair"));

            //Exibindo resultado
            JOptionPane.showMessageDialog(null, "Você escolheu: " + opcao);

        } while (opcao != 0);
    }
}
