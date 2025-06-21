import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {

        //Criando o scanner
        Scanner scanner = new Scanner(System.in);

        //Criando o vetor
        int[] vetor = new int[10];

        // Iniciando programa
        System.out.println("********** PROGRAMA VETOR COM NÚMEROS PARES DE 2 A 20 **********");

        for (int i = 0; i < vetor.length; ) {
            System.out.print("Digite um número PAR de 2 a 20 para a posição [" + i + "]: ");
            int numero = scanner.nextInt();

            // Verificando se o número é par e está no intervalo
            if (numero % 2 == 0 && numero >= 2 && numero <= 20) {
                vetor[i] = numero;
                i++; // Só avança se o número for válido
            } else {
                System.out.println("Número inválido! Digite apenas números PARES entre 2 e 20.");
            }
        }

        // Exibindo o vetor na horizontal
        System.out.println("\nVocê digitou o VETOR:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // Quebra de linha

       

        // Perguntando se quer ver o valor de cada posição
        System.out.print("Deseja ver o valor de cada posição? (sim/não): ");
        String r = scanner.nextLine();

        if (r.equalsIgnoreCase("sim")) {
            System.out.println("Você digitou os seguintes números:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Posição [" + i + "] = " + vetor[i]);
            }
        } else {
            System.out.println("FIM DO PROGRAMA.");
        }

        scanner.close();
    }
}
