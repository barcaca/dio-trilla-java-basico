/**
 * A classe Conta é uma classe abstrata que representa uma conta genérica em um banco.
 */
public abstract class Conta implements IConta {
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  private Cliente cliente;

  /**
   * Construtor da classe Conta.
   * 
   * @param cliente O cliente associado à conta.
   * @param agencia O número da agência da conta.
   */
  public Conta(Cliente cliente, int agencia) {
    this.agencia = agencia;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    if (valor > 0 && saldo >= valor) {
      this.saldo -= valor;
      System.out.println("Saque realizado com sucesso.");
    } else if (valor <= 0) {
      System.out.println("Valor de saque inválido.");
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  @Override
  public void depositar(double valor) {
    if (valor > 0) {
      this.saldo += valor;
      System.out.println("Depósito realizado com sucesso.");
    } else {
      System.out.println("Valor de depósito inválido.");
    }
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    if (valor > 0 && saldo >= valor) {
      this.sacar(valor);
      contaDestino.depositar(valor);
      System.out.println("Transferência realizada com sucesso.");
    } else if (valor <= 0) {
      System.out.println("Valor de transferência inválido.");
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  /**
   * Imprime as informações comuns da conta.
   */
  protected void imprimirInfosComuns() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agência: %d", this.agencia));
    System.out.println(String.format("Número: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }

  /**
   * Obtém o número da agência da conta.
   * 
   * @return O número da agência.
   */
  public int getAgencia() {
    return agencia;
  }

  /**
   * Obtém o número da conta.
   * 
   * @return O número da conta.
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Obtém o saldo da conta.
   * 
   * @return O saldo da conta.
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * Obtém o cliente associado à conta.
   * 
   * @return O cliente associado à conta.
   */
  public Cliente getCliente() {
    return cliente;
  }
}
