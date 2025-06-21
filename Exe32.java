import javax.swing.JOptionPane;

public class Exe32 {
    public static void main(String[] args) {
        
        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA NÚMEROS DE 1 A 20");

        int i = 1;
        String resultado = "Números de 1 a 20:\n";

        //Usando while para mostrar os números
        while (i <= 20) {
            resultado += i + " ";
            i++;
        }

        //Mostrando o resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
