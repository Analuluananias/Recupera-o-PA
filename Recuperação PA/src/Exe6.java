import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        
        //Criando o scanner
        Scanner scanner = new Scanner(System.in);

        //Criando a matriz
        int [][] matriz = new int[3][3];

        //Criando um contador
        int contador = 0;

        //Iniciando Programa
        System.out.println("********* PROGRAMA MATRIZ MAIORES QUE 10 **********");
        for(int linha = 0; linha < 3; linha++){
           for(int coluna = 0; coluna < 3; coluna++){
            System.out.println("Digite o valor para [ " + linha + " ] [ " + coluna + " ] : ");
            matriz[linha][coluna] = scanner.nextInt();
            if(matriz[linha][coluna] > 10){
                contador++;
            }
           }
        }

        //Exibindo o resultado
        System.out.println("Você digitou " + contador + " números maiores que 10." );

        //Fechando scanner
        scanner.close();
    }
}
