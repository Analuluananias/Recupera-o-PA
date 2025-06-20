import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        //Criando o scanner
         Scanner scanner = new Scanner(System.in);

         //Criando a matriz
         int [] [] matriz = new int[2][2];
       
         //Pedindo os valores ao usuario
         System.out.println("*********************** PROGRAMA MATRIZ ***************************");
         for(int linha = 0; linha < 2; linha++){
            for (int coluna = 0; coluna < 2; coluna ++){
                System.out.print("Digite o valor para [ " + linha +  " ] [ " + coluna + "] : ");
                matriz[linha][coluna] =  scanner.nextInt();
            }
         }

         //Retornando valores
         System.out.println("Você digitou a Matriz:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }


         //fechando o scanner
         scanner.close();
    }
}
