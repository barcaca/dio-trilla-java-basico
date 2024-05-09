import java.util.Scanner;

public class VerificadorNumeroConta {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      String numeroConta = scanner.next();
      verificarNumeroConta(numeroConta);
      // Imprime que o número de conta é válido:
      System.out.println("Numero de conta valido.");
    } catch (Exception e) {
      // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
      System.out.println("Erro: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }

  // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8
  // dígitos:
  private static void verificarNumeroConta(String numeroConta) {
    // Se o número de conta não tiver exatamente 8 dígitos, lançar uma exceção do tipo
    // IllegalArgumentException:
    if (numeroConta.length() != 8) {
      throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    }

  }
}
