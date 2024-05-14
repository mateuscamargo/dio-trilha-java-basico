import java.util.Arrays;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String clienteNome;
        String agencia;
        int contabanco;
        double saldo = 237.48;

        System.out.println("Olá, para começar digite seu nome: ");
        clienteNome = scanner.nextLine();

        System.out.println("Digite sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite sua conta bancária: ");
        contabanco = scanner.nextInt();

        System.out.println("Olá " + clienteNome + ", obrigado por criar uma conta (" + contabanco + ") em nosso banco, sua agência é " + agencia + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}