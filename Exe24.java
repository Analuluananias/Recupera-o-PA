import javax.swing.JOptionPane;

public class Exe24 {
    public static void main(String[] args) {

        //Criando o vetor de nomes
        String[] nomes = new String[10];

        //Pedindo os nomes
        for (int i = 0; i < 10; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome [" + (i + 1) + "]:");
        }

        //Mostrando os nomes um por linha
        String saida = "Nomes digitados:\n";
        for (int i = 0; i < 10; i++) {
            saida += nomes[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, saida);
    }
}
