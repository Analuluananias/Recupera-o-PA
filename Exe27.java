import javax.swing.JOptionPane;

public class Exe27 {
    public static void main(String[] args) {
        //Vetores para armazenar nomes e notas
        String[] nomes = new String[5];
        double[] notas1 = new double[5];
        double[] notas2 = new double[5];

        String resultado = "";

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"PROGRAMA NOTAS");

        //Coletando dados
        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1));
            notas1[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota de " + nomes[i]));
            notas2[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota de " + nomes[i]));
        }

        //Calculando média e mostrando
        for (int i = 0; i < 5; i++) {
            double media = (notas1[i] + notas2[i]) / 2;
            resultado += nomes[i] + " - Média: " + media + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
