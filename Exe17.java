import javax.swing.JOptionPane;

public class Exe17 {
    public static void main(String[] args) {

        //Iniciando o programa
        JOptionPane.showMessageDialog(null, "CALCULADORA");

        //Pedindo o primeiro número
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));

        //Pedindo o segundo número
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        //Pedindo a operação
        String op = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");

        double resultado = 0; //variável pra guardar o resultado

        //Fazendo o cálculo conforme a operação
        switch (op) {
            case "+":
                resultado = n1 + n2;
                break;

            case "-":
                resultado = n1 - n2;
                break;

            case "*":
                resultado = n1 * n2;
                break;

            case "/":
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                    return; //sai do programa se tentar dividir por zero
                }
                break;

            //Se digitar operador inválido
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
                return;
        }

        //Mostrando o resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
