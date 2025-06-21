import javax.swing.JOptionPane;

public class Exe20 {
    public static void main(String[] args) {

        //Iniciando o programa
        JOptionPane.showMessageDialog(null, "SISTEMA DE VOTAÇÃO");

        int[] votos = new int[3]; //índice 0 = cand1, 1 = cand2, 2 = branco
        int opcao;

        //Loop de votação
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Vote no candidato:\n1 - Candidato 1\n2 - Candidato 2\n3 - Branco\n0 - Encerrar votação"
            ));

            switch (opcao) {
                case 1:
                    votos[0]++;
                    break;
                case 2:
                    votos[1]++;
                    break;
                case 3:
                    votos[2]++;
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        } while (opcao != 0);

        //Mostrando o resultado
        JOptionPane.showMessageDialog(null,
            "Resultado da votação:\nCandidato 1: " + votos[0] +
            "\nCandidato 2: " + votos[1] +
            "\nBrancos: " + votos[2]);
    }
}
