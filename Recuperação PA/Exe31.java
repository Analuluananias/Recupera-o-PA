import javax.swing.JOptionPane;

public class Exe31 {
    public static void main(String[] args) {
        
        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA SOMA ATÉ 0");

        int numero, soma = 0;

        //Lendo e somando até que o número seja 0
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (0 para encerrar):"));
            soma += numero;
        } while (numero != 0);

        //Exibindo o resultado
        JOptionPane.showMessageDialog(null, "A soma total dos números é: " + soma);
    }
}
