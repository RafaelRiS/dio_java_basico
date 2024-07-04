import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
          
          //Exibindo o menu
          
          System.out.println("\nEscolha uma opcao:");
          System.out.println("1 - Depositar");
          System.out.println("2 - Sacar");
          System.out.println("3 - Consultar Saldo");
          System.out.println("0 - Encerrar Programa");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor que deseja depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito <= 0) {
                      System.out.println("Saldo insuficiente.");
                    } else {
                        saldo += valorDeposito;
                    System.out.println("Deposito realizado com sucesso. Saldo atual: " + saldo);
                    }
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                      System.out.println("Saldo insuficiente.");
                    } else {
                      saldo -= valorSaque;
                      System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}



