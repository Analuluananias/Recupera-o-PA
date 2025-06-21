import javax.swing.JOptionPane;

public class Exe42 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"CONTADOR DE POSITIVOS");

        //Variáveis
        int numero, positivos = 0;

        //Laço para ler até número negativo
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (negativo para parar):"));

            if (numero >= 0) {
                positivos++;
            }
        } while (numero >= 0);

        //Mostrando total de positivos
        JOptionPane.showMessageDialog(null, "Total de números positivos: " + positivos);
    }
}
