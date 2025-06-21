import javax.swing.JOptionPane;

public class Exe41 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"NÚMEROS DE 1 A 10");

        //Variáveis
        int i = 1;
        String resultado = "";

        //Laço para contar até 10
        do {
            resultado += i + "\n";
            i++;
        } while (i <= 10);

        //Exibindo resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
