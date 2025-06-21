import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) throws Exception {

        //Criando o Scanner
        Scanner scanner = new Scanner(System.in);

        //Criando o vetor
        int [] vetor = new int[5];
        
        System.out.println("********************** PROGRAMA VETOR ***********************");
        //Pedindo os valores ao usuario
        for (int linha = 0; linha < vetor.length; linha++){
            System.out.print("Digite o valor da posição [ " + linha + " ] : " );
            vetor[linha] = scanner.nextInt();
        }

        //Retornando 
        System.out.println("Você digitou o Vetor:");
        for (int linha = 0; linha < vetor.length; linha++){
            System.out.print(vetor[linha] + " ");
        }
        //Fechando scanner
        scanner.close();
        
    }
}
