import javax.swing.JOptionPane;

public class Exe34 {
    public static void main(String[] args) {
        
        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA MÉDIA DE VALORES POSITIVOS");

        //Criando as variáveis
        int numero = 0;
        int soma = 0;
        int contador = 0;

        //Lendo valores até digitar número negativo
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo (ou negativo para sair):"));
            if (numero >= 0) {
                soma += numero;
                contador++;
            }
        } while (numero >= 0);

        //Mostrando média se valores válidos foram inseridos
        if (contador > 0) {
            double media = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "A média dos valores é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número positivo foi inserido.");
        }
    }
}
