import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        
        //Criando o scanner
        Scanner scanner = new Scanner(System.in);
        //Criando a Matriz
        int [] [] matriz = new int[3][3];

        //Iniciando programa
        System.out.println("********* PROGRAMA MATRIZ, DIAGONAL PRINCIPAL **********");
        for(int linha = 0; linha < 3; linha++){
         for(int coluna = 0; coluna < 3; coluna++){
            System.out.println("Digite o valor para [ " + linha + " ] [ " + coluna + " ] :");
            matriz[linha][coluna] = scanner.nextInt();
         }
        }

        //Exibindo valores
        System.out.println("Você digitou as diagonais principais:");
        for(int linha = 0; linha < 3; linha++){
         for(int coluna = 0; coluna < 3; coluna++){
            if(linha == coluna){
                System.out.println(matriz[linha][coluna] + " ");
            }
         }
        }

        //Fechando o scanner
        scanner.close();
    }
}
