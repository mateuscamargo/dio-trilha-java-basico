import java.util.Arrays;

public class Operadores {

    public static void main(String[] args) {
        String concatenacao = "?";
            System.out.println(concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
            System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
            System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
            System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
            System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);

        // OPERADORES 4

        int numero = 5;

        numero = numero + 2;

        numero++; //numero = numero + 1

        System.out.println(numero);

        numero--;

        System.out.println(numero);
    }
}
