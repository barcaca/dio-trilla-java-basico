import java.util.Scanner;

public class Contador {
  /**
   * The main method is the entry point of the program. It reads two parameters from the user,
   * validates them, and then calls the {@link #contar(int, int)} method.
   *
   * @param args Command line arguments (not used in this program)
   */
  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Read first parameter as integer
    System.out.print("Digite o primeiro parâmetro: ");
    int parametroUm = Integer.parseInt(scanner.nextLine());

    // Read second parameter as integer
    System.out.print("Digite o segundo parâmetro: ");
    int parametroDois = Integer.parseInt(scanner.nextLine());

    try {
      // Call contar method to perform counting
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException e) {
      // Handle invalid parameter case
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
    // Close the Scanner to release resources
    scanner.close();
  }

  /**
   * This method counts from the second parameter down to the first parameter.
   *
   * @param parametroUm The first parameter.
   * @param parametroDois The second parameter.
   * @throws ParametrosInvalidosException If the second parameter is not greater than the first
   *         parameter.
   */
  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

    // Throw exception if parameters are invalid
    if (parametroDois < parametroUm)
      throw new ParametrosInvalidosException();

    // Calculate the number of elements to count (inclusive)
    int contagem = parametroDois - parametroUm;

    for (int i = 0; i < contagem; i++) {
      // Print the count message
      System.out.println("Imprimindo o  número " + (i + 1));
    }
  }
}
