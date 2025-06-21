import javax.swing.JOptionPane;

public class Exe35 {
    public static void main(String[] args) {
        
        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA MÉDIA DAS IDADES");

        int idade, soma = 0, contador = 0;

        //Lendo idades até digitar -1
        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade (-1 para sair):"));
            if (idade != -1) {
                soma += idade;
                contador++;
            }
        } while (idade != -1);

        //Calculando e mostrando a média
        if (contador > 0) {
            double media = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "A média das idades é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma idade válida foi informada.");
        }
    }
}
