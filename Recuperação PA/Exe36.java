import javax.swing.JOptionPane;

public class Exe36 {
    public static void main(String[] args) {
        
        //Mensagem inicial
        JOptionPane.showMessageDialog(null, "PROGRAMA MENU DE OPÇÕES");

        int opcao;

        //Menu com opções e repetição até escolher sair
        do {
            String menu = "Escolha uma opção:\n";
            menu += "1 - Dizer 'Oi'\n";
            menu += "2 - Dizer 'Tudo bem?'\n";
            menu += "0 - Sair\n";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Oi!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Tudo bem?");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (opcao != 0);
    }
}
