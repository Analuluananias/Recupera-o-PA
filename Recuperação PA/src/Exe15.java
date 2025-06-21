import javax.swing.JOptionPane;

public class Exe15 {
    public static void main(String[] args) {

        //Iniciando Programa
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Quanto tem de saldo:"));
        String opcao = JOptionPane.showInputDialog("Digite uma opção entre: saque, depósito ou saldo:");

        //Processando Resposta
        switch (opcao.toLowerCase()) {
            case "saque":
                double saque = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar:"));
                if (saldo == 0 && saque > saldo) {
                    JOptionPane.showMessageDialog(null, "Você não pode sacar esse valor.");
                } else {
                    JOptionPane.showMessageDialog(null, "Você sacou: " + saque);
                }
                break;

            case "depósito":
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer depositar:"));
                JOptionPane.showMessageDialog(null, "Você depositou: " + deposito);
                 JOptionPane.showMessageDialog(null, "Seu saldo agora é de: " + (deposito + saldo));
                break;

            case "saldo":
                JOptionPane.showMessageDialog(null, "Seu saldo é de: " + saldo);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
        
    }
    
}