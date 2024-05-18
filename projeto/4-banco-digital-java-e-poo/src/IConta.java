/**
 * A interface IConta define os métodos que devem ser implementados por classes que representam
 * contas em um banco.
 */
public interface IConta {

  /**
   * Realiza um saque na conta.
   * 
   * @param valor O valor a ser sacado.
   */
  void sacar(double valor);

  /**
   * Realiza um depósito na conta.
   * 
   * @param valor O valor a ser depositado.
   */
  void depositar(double valor);

  /**
   * Transfere um valor para outra conta.
   * 
   * @param valor O valor a ser transferido.
   * @param contaDestino A conta de destino da transferência.
   */
  void transferir(double valor, Conta contaDestino);

  /**
   * Imprime o extrato da conta.
   */
  void imprimirExtrato();
}
