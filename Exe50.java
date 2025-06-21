import javax.swing.JOptionPane;

public class Exe50 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"SISTEMA BANCÁRIO");

        //Variáveis
        double saldo = 0, valor;
        int opcao;
        
        //Menu com do while
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU\n1 - Ver Saldo\n2 - Depositar\n3 - Sacar\n0 - Sair"));

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo atual: R$" + saldo);
                    break;

                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                    saldo += valor;
                    JOptionPane.showMessageDialog(null, "Depósito realizado. Novo saldo: R$" + saldo);
                    break;

                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                    if (valor <= saldo) {
                        saldo -= valor;
                        JOptionPane.showMessageDialog(null, "Saque realizado. Novo saldo: R$" + saldo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }

        } while (opcao != 0);
    }
}
