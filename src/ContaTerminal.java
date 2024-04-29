import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando o número da conta
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Para limpar o buffer do ENTER

        // Solicitando a agência
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        // Solicitando o nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitando o saldo
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Mensagem final
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo R$ %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numeroConta, saldo
        );

    }
}
