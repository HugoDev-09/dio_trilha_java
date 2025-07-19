import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe a Agencia da sua conta: ");
        String agencia = scanner.next();

        System.out.println("Informe seu Nome: ");
        scanner.nextLine(); // consome a quebra de linha
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o Saldo: ");
        double saldoBancario = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo de R$%.2f já está disponível para saque.\n",
                nomeCliente, agencia, numero, saldoBancario);

        scanner.close();
    }
}
