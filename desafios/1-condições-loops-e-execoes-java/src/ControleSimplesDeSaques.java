import java.util.Scanner;

public class ControleSimplesDeSaques {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double limiteDiario = scanner.nextDouble();

    for (int saqueAtual = 1; saqueAtual > 0; saqueAtual++) {

      int valorSaque = scanner.nextInt();

      if (valorSaque == 0) {
        System.out.println("Transacoes encerradas.");
        scanner.close();
        return;
      } else if (valorSaque <= limiteDiario) {
        limiteDiario -= valorSaque;
        System.out.println("Saque realizado. Limite restante: " + limiteDiario);
      } else {
        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        scanner.close();
        return;
      }
    }
    scanner.close();
  }
}
