import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        
        //Criando Scanner
        Scanner scanner = new Scanner(System.in);

        //Criando a matriz 
        int[][] matriz = new int[5][5];

        // Começa com o menor valor possível
        int maior = Integer.MIN_VALUE;
        
        //Variáveis para guardar o maior valor e sua posição
        int linhaMaior = 0;
        int colunaMaior = 0;

        //Iniciando o programa
        System.out.println("******************* PROGRAMA MAIOR VALOR DA MATRIZ *******************");

        //Preenchendo a matriz e procurando o maior valor
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Digite o valor para [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();

                //Verificando se o valor atual é maior que o maior atual
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];    //Atualiza o maior valor
                    linhaMaior = linha;                //Guarda a linha do maior
                    colunaMaior = coluna;              //Guarda a coluna do maior
                }
            }
        }

        //Exibindo os maiores valores
        System.out.println("O maior valor digitado foi " + maior + 
                           " e está na posição [" + linhaMaior + "][" + colunaMaior + "].");

        //Fechando Scanner
        scanner.close();
    }
}
