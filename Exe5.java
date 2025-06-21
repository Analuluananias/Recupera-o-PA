import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        
        //Criando o vetor
        Scanner scanner = new Scanner(System.in);
        
        //Criando o vetor
        double[] notas = new double[10];

        //Para somar todas as notas
        double soma = 0;

        //Iniciando o programa
        System.out.println("*********** PROGRAMA DE NOTAS **********");
        for (int linha = 0; linha < 10; linha++) {
            System.out.print("Digite a nota do aluno [" + linha + "]: ");
            notas[linha] = scanner.nextDouble();
            soma += notas[linha];
        }
        
        //Calculando a media
        double media = soma / 10;
        
        //Exibindo a média final
        System.out.println("A média final da turma é: " + media);

        scanner.close();
    }
}
