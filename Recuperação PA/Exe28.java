import javax.swing.JOptionPane;

public class Exe28 {
    public static void main(String[] args) {

        //Iniciando programa
        JOptionPane.showMessageDialog(null, "Calculadora Fatorial");

        //Recebendo os dados
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para fatorar"));
        int fatorial = 1;
        
       for(int i = num; i >= 1; i--) {
         fatorial = fatorial * i;
       }
       JOptionPane.showMessageDialog(null, "O fatorial desse é: " + fatorial);
    }
    
}