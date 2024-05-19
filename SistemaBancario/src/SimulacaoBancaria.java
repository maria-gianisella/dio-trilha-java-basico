import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        while (true) {
            int opcao = scanner.nextInt();
            double valor = 0;
            switch (opcao) {
                case 1:
                    valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    valor = scanner.nextDouble();
                    if(valor > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valor;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    ;
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}