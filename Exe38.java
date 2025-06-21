import javax.swing.JOptionPane;

public class Exe38 {
    public static void main(String[] args) {

        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA CONTADOR REGRESSIVO");

        //Lendo o número inicial
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial para contagem regressiva:"));

        //Construindo a contagem
        String resultado = "Contagem regressiva:\n";
        while (numero >= 0) {
            resultado += numero + " ";
            numero--;
        }

        //Exibindo resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
