/**
 * A classe ContaPoupanca representa uma conta poupança em um banco.
 */
public class ContaPoupanca extends Conta {

  /**
   * Construtor da classe ContaPoupanca.
   * 
   * @param cliente O cliente associado à conta.
   * @param agencia O número da agência da conta.
   */
  public ContaPoupanca(Cliente cliente, int agencia) {
    super(cliente, agencia);
  }

  /**
   * Imprime o extrato da conta poupança.
   */
  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupança ===");
    super.imprimirInfosComuns();
  }
}
