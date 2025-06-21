import javax.swing.JOptionPane;

public class Exe40 {
    public static void main(String[] args) {

        //Iniciando
        JOptionPane.showMessageDialog(null, "PROGRAMA CALCULADORA");

        int opcao;

        //Laço do menu
        do {
            String menu = "Escolha uma operação:\n";
            menu += "1 - Soma\n";
            menu += "2 - Subtração\n";
            menu += "3 - Multiplicação\n";
            menu += "4 - Divisão\n";
            menu += "0 - Sair";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            //Se for sair
            if (opcao == 0) {
                JOptionPane.showMessageDialog(null, "Encerrando calculadora.");
                break;
            }

            //Lendo os dois números
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            double resultado = 0;
            String operacao = "";

            //Executando a operação
            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    operacao = "Soma";
                    break;
                case 2:
                    resultado = num1 - num2;
                    operacao = "Subtração";
                    break;
                case 3:
                    resultado = num1 * num2;
                    operacao = "Multiplicação";
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        operacao = "Divisão";
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                        continue;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    continue;
            }

            //Exibindo o resultado
            JOptionPane.showMessageDialog(null, operacao + " = " + resultado);

        } while (opcao != 0);
    }
}
