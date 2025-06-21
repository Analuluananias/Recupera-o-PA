import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        
        //Criando o scanner
        Scanner scanner = new Scanner(System.in);

        //Criando os dois vetores
        double [] vetor1 = new double[5];
        double [] vetor2 = new double[5];
        double [] vetor3 = new double[5];

        //Iniciando vetor1
        System.out.println("********** PROGRAMA SOMA DE VETORES ************");
        System.out.println("Digite os valores do vetor 1:");       //PEDINDO VALORES
        for (int linha = 0; linha < vetor1.length; linha++){
            System.out.print("Digite o valor da posição [ " + linha + " ] : " );
            vetor1[linha] = scanner.nextDouble();
        }
        
        System.out.println("Digite os valores do vetor 2:");       //PEDINDO VALORES 
        for (int linha = 0; linha < vetor1.length; linha++){
            System.out.print("Digite o valor da posição [ " + linha + " ] : " );
            vetor2[linha] = scanner.nextDouble();
        }
        
        //Somando vetor e exibindo
        for (int linha = 0; linha < vetor1.length; linha++) {
            vetor3[linha] = vetor1[linha] + vetor2[linha];
        }

        //Exibindo valores
        System.out.println("O vetor soma ficou:");
        for (int linha = 0; linha < vetor3.length; linha++) {
            System.out.println("Posição [" + linha + "] = " + vetor3[linha]);
        }

        //Fechando Scanner
        scanner.close();
    }
}
