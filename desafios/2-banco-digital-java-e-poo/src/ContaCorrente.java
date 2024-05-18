/**
 * A classe ContaCorrente representa uma conta corrente em um banco.
 */
public class ContaCorrente extends Conta {

  /**
   * Construtor da classe ContaCorrente.
   * 
   * @param cliente O cliente associado à conta.
   * @param agencia O número da agência da conta.
   */
  public ContaCorrente(Cliente cliente, int agencia) {
    super(cliente, agencia);
  }

  /**
   * Imprime o extrato da conta corrente.
   */
  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
    super.imprimirInfosComuns();
  }
}
