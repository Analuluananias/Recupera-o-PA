import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        
        //Criando Scanner
        Scanner scanner = new Scanner(System.in);

        //Criando a matriz
        int[][] matriz = new int[3][3];

        //Criando a variável para verificar se é simétrica
        boolean simetrica = true;

        //Iniciando o programa e pedindo os valores
        for (int linha = 0; linha < 3; linha++) {
         for (int coluna = 0; coluna < 3; coluna++) {
            System.out.print("Digite o valor para [ " + linha + " ] [ " + coluna + " ] : ");
            matriz[linha][coluna] = scanner.nextInt();
         }
        }

        //Verificando se a matriz é simétrica
        for (int linha = 0; linha < 3; linha++) {
         for (int coluna = 0; coluna < 3; coluna++) {
            if (matriz[linha][coluna] != matriz[coluna][linha]) {
                simetrica = false;
            }
         }
        }

        //Exibindo o resultado final
        if (simetrica) {
            System.out.println("A matriz É SIMÉTRICA.");
        } else {
            System.out.println("A matriz NÃO É SIMÉTRICA.");
        }

        //Fechando scanner
        scanner.close();
    }
}
