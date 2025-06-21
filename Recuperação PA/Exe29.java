import javax.swing.JOptionPane;

public class Exe29 {
    public static void main(String[] args) {
        
        //Iniciando
        JOptionPane.showMessageDialog(null,"PROGRAMA NÚMERO PRIMO");

        //Lendo o número
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar se ele é primo:"));

        int divisores = 0;

        //Verificando quantos divisores o número possui
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        //Verificando se é primo (apenas 2 divisores: 1 e ele mesmo)
        if (divisores == 2) {
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
        }
    }
}
