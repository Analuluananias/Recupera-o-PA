import javax.swing.JOptionPane;

public class Exe30 {
    public static void main(String[] args) {
        
        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA SEQUÊNCIA DE FIBONACCI");

        //Lendo a quantidade de termos
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos da sequência:"));

        //Variáveis auxiliares
        int a = 0, b = 1, c;
        String sequencia = "Sequência de Fibonacci:\n";

        //Gerando a sequência
        for (int i = 0; i < n; i++) {
            sequencia += a + " ";
            c = a + b;
            a = b;
            b = c;
        }

        //Mostrando a sequência
        JOptionPane.showMessageDialog(null, sequencia);
    }
}
