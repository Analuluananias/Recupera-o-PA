import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        
        //Criando o scanner
        Scanner scanner = new Scanner(System.in);

        //Iniciando programa
        System.out.println("********* CONVERSÃO DE MEDIDAS *********");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Quilômetros para Metros");
        System.out.println("2 - Metros para Centímetros");
        System.out.println("3 - Metros para Milímetros");
        System.out.println("4 - Centímetros para Metros");
        System.out.println("5 - Metros para Quilômetros");

        //Lendo opção do usuário
        System.out.print("Digite sua opção: ");
        int opcao = scanner.nextInt();

        //Lendo o valor a ser convertido
        System.out.print("Digite o valor que deseja converter: ");
        double valor = scanner.nextDouble();

        //Fazendo a conversão
        switch (opcao) {
            case 1:
                System.out.println(valor + " km equivalem a " + (valor * 1000) + " metros.");
                break;
            case 2:
                System.out.println(valor + " metros equivalem a " + (valor * 100) + " centímetros.");
                break;
            case 3:
                System.out.println(valor + " metros equivalem a " + (valor * 1000) + " milímetros.");
                break;
            case 4:
                System.out.println(valor + " centímetros equivalem a " + (valor / 100) + " metros.");
                break;
            case 5:
                System.out.println(valor + " metros equivalem a " + (valor / 1000) + " quilômetros.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        //Fechando o scanner
        scanner.close();
    }
}
