import javax.swing.JOptionPane;

public class Exe12 {
    public static void main(String[] args) {

        //Pedindo o dia da semana
        JOptionPane.showMessageDialog(null, "PROGRAMA DIA DA SEMANA");
        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7:"));

        //Verificando e exibindo o dia
        switch (d) {
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda-Feira");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça-Feira");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta-Feira");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta-Feira");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta-Feira");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido! Digite de 1 a 7");
                break;
        }
    }
}
