import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o número da Agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, insira o número da Conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor, insira o nome do Cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, insira o saldo inicial: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo R$ " + conta.getSaldo() + " já está disponível para saque.");

        scanner.close();
    }
}
