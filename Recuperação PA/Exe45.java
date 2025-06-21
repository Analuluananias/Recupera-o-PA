import javax.swing.JOptionPane;

public class Exe45 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"SOMA DE COMPRAS");

        //Variáveis
        double valor, total = 0;
        int continuar;

        //Laço para somar compras
        do {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:"));
            total += valor;

            continuar = JOptionPane.showConfirmDialog(null, "Deseja adicionar outra compra?");
        } while (continuar == JOptionPane.YES_OPTION);

        //Mostrando total
        JOptionPane.showMessageDialog(null, "Total das compras: R$" + total);
    }
}
