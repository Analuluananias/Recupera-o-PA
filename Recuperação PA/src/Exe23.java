public class Exe23 {
    public static void main(String[] args) {

        //Iniciando o programa
        int contador = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        //Mostrando a quantidade de pares
        System.out.println("Quantidade de números pares entre 1 e 50: " + contador);
    }
}
