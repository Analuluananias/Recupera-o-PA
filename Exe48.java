import javax.swing.JOptionPane;

public class Exe48 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null,"NOTAS DE ALUNOS");

        //Variáveis
        String nome;
        double nota1, nota2, media;
        int continuar;

        //Laço para repetir até o usuário parar
        do {
            nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota de " + nome));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota de " + nome));

            media = (nota1 + nota2) / 2;

            //Mostrando média
            JOptionPane.showMessageDialog(null, nome + " - Média: " + media);

            //Perguntando se deseja continuar
            continuar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?");
        } while (continuar == JOptionPane.YES_OPTION);
    }
}
