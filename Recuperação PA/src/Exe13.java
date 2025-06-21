import javax.swing.JOptionPane;

public class Exe13 {
    public static void main(String[] args) {

        //Pedindo a letra
        String letra = JOptionPane.showInputDialog("Digite uma letra:");

        //Verificando se é vogal ou consoante
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                JOptionPane.showMessageDialog(null, "É uma vogal.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "É uma consoante.");
                break;
        }
    }
}
