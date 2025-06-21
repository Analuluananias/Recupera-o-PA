import javax.swing.JOptionPane;
import java.util.Random;

public class Exe46 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"JOGO DE ADIVINHAÇÃO");

        //Variáveis
        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(100) + 1;
        int chute;

        //Laço de tentativas
        do {
            chute = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número (1 a 100):"));

            if (chute > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Muito alto!");
            } else if (chute < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Muito baixo!");
            } else {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou!");
            }

        } while (chute != numeroSecreto);
    }
}
