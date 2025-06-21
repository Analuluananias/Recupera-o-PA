import javax.swing.JOptionPane;

public class Exe16 {
    public static void main(String[] args) {
        
        //Iniciando o programa
        JOptionPane.showMessageDialog(null, "CATEGORIA DO PRODUTO");

        //Pedindo o nome do produto
        String produto = JOptionPane.showInputDialog("Digite o nome do produto:").toLowerCase();

        //Verificando a categoria do produto
        switch (produto) {
            case "arroz":
            case "feijão":
            case "macarrão":
                JOptionPane.showMessageDialog(null, "Categoria: Alimento");
                break;

            case "shampoo":
            case "sabonete":
            case "pasta de dente":
                JOptionPane.showMessageDialog(null, "Categoria: Higiene");
                break;

            case "camiseta":
            case "calça":
            case "tênis":
                JOptionPane.showMessageDialog(null, "Categoria: Vestuário");
                break;

            //Se não for nenhum dos cadastrados
            default:
                JOptionPane.showMessageDialog(null, "Categoria não cadastrada");
        }
    }
}
