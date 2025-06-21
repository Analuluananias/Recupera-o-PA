import javax.swing.JOptionPane;

public class Exe44 {
    public static void main(String[] args) {
    
        //Iniciando programa
        JOptionPane.showMessageDialog(null,"LISTA DE NOMES");

         //Variáveis
        String nome, resultado = "";


        //Laço para ler nomes
        do {
            nome = JOptionPane.showInputDialog("Digite um nome (ou 'fim' para encerrar):");

            if (!nome.equalsIgnoreCase("fim")) {
                resultado += nome + "\n";
            }
        } while (!nome.equalsIgnoreCase("fim"));

        //Mostrando nomes digitados
        JOptionPane.showMessageDialog(null, "Nomes digitados:\n" + resultado);
    }
}
