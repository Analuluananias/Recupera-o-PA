import javax.swing.JOptionPane;

public class Exe26 {
    public static void main(String[] args) {

        //Inicando Programa
        JOptionPane.showMessageDialog(null,"PROGRAMA TABUADA");
        
        //Lendo o número
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ver a tabuada:"));
        
        //Gerando a tabuada
        String resultado = "Tabuada do " + numero + ":\n";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        //Exibindo o resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
