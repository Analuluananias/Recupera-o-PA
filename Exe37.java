import javax.swing.JOptionPane;

public class Exe37 {
    public static void main(String[] args) {

        //Inicio
        JOptionPane.showMessageDialog(null, "PROGRAMA MÉDIA DE NOTAS");

        //Variáveis para soma e contagem
        double nota, soma = 0;
        int contador = 0;

        //Lendo notas válidas
        do {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota entre 0 e 10:"));
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            }
        } while (nota >= 0 && nota <= 10);

        //Calculando e exibindo média
        if (contador > 0) {
            double media = soma / contador;
            JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma nota válida foi inserida.");
        }
    }
}
