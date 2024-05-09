import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    // Loop infinito para manter o programa em execução até que o usuário decida sair
    while (true) {
      int opcao = scanner.nextInt();
      // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
      switch (opcao) {
        case 1:
          double depositar = scanner.nextDouble();
          saldo += depositar;
          System.out.println("Saldo atual: " + saldo);
          break;
        case 2:
          double sacar = scanner.nextDouble();
          if (sacar > saldo) {
            System.out.println("Saldo insuficiente.");
          } else {
            saldo -= sacar;
            System.out.println("Saldo atual: " + saldo);
          }
          break;
        case 3:
          System.out.println("Saldo atual: " + saldo);
          break;
        case 0:
          System.out.println("Programa encerrado.");
          scanner.close();
          return;
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
  }
}
