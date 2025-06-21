import javax.swing.JOptionPane;

public class Exe22 {
    public static void main(String[] args) {

        //Iniciando o programa
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º número:"));
            soma += num;
        }

        //Mostrando a soma final
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
    }
}
