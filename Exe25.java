import javax.swing.JOptionPane;

public class Exe25 {
    public static void main(String[] args) {

        //Iniciando o programa
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º número:"));
            if (num > maior) {
                maior = num;
            }
        }

        //Mostrando o maior número
        JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
    }
}
