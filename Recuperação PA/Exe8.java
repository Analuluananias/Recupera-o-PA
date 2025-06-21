import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        
        //Criando Scanner
        Scanner scanner = new Scanner(System.in);

        //Criando s matriz
        int [][] matriz = new int[4][4];
        int contador = 0;

        //Iniciando programa
        System.out.println("******************* PROGRAMA MATRIZ PAR *******************");
        for(int linha = 0; linha < 4; linha++){
         for(int coluna = 0; coluna < 4; coluna++){
            System.out.println("Digite o valor para [ " + linha + " ] [ " + coluna + " ] :");
            matriz[linha][coluna] = scanner.nextInt();
            if(matriz[linha][coluna] % 2 == 0){
                contador++;
            }
         }
        }

        //Exibindo resultado final
        System.out.println("A matriz possui " + contador + " números pares.");

        //Fechando scanner
        scanner.close();
    }
}
