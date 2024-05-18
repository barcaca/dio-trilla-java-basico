import java.util.ArrayList;
import java.util.List;

/**
 * A classe Banco representa um banco digital que gerencia clientes e suas contas.
 */
public class Banco {
  private static final int AGENCIA_PADRAO = 1234;
  private String nome;
  private List<Cliente> clientes;

  /**
   * Construtor da classe Banco.
   * 
   * @param nome Nome do banco.
   */
  public Banco(String nome) {
    this.nome = nome;
    this.clientes = new ArrayList<>();
  }

  /**
   * Abre uma conta corrente para o cliente especificado.
   * 
   * @param cliente Cliente para quem a conta será aberta.
   * @return A conta corrente criada.
   */
  public ContaCorrente abrirContaCorrente(Cliente cliente) {
    ContaCorrente conta = new ContaCorrente(cliente, AGENCIA_PADRAO);
    cliente.adicionarConta(conta);
    if (!clientes.contains(cliente)) {
      this.clientes.add(cliente);
    }
    return conta;
  }

  /**
   * Abre uma conta poupança para o cliente especificado.
   * 
   * @param cliente Cliente para quem a conta será aberta.
   * @return A conta poupança criada.
   */
  public ContaPoupanca abrirContaPoupanca(Cliente cliente) {
    ContaPoupanca conta = new ContaPoupanca(cliente, AGENCIA_PADRAO);
    cliente.adicionarConta(conta);
    if (!clientes.contains(cliente)) {
      this.clientes.add(cliente);
    }
    return conta;
  }

  /**
   * Procura um cliente pelo CPF.
   * 
   * @param cpf CPF do cliente a ser procurado.
   * @return O cliente encontrado, ou null se não encontrado.
   */
  private Cliente procurarClientePorCPF(String cpf) {
    for (Cliente cliente : clientes) {
      if (cliente.getCpf().equals(cpf)) {
        return cliente;
      }
    }
    return null;
  }

  /**
   * Imprime as informações do cliente encontrado pelo CPF.
   * 
   * @param cpf CPF do cliente cujas informações serão impressas.
   */
  public void imprimirInformacoesClientePorCPF(String cpf) {
    Cliente cliente = procurarClientePorCPF(cpf);
    if (cliente != null) {
      System.out.println(cliente.imprimirInformacoes());
    } else {
      System.out.println("Cliente não encontrado.");
    }
  }

  /**
   * Transfere um valor entre duas contas.
   * 
   * @param contaOrigem Conta de origem da transferência.
   * @param contaDestino Conta de destino da transferência.
   * @param valor Valor a ser transferido.
   */
  public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
    contaOrigem.transferir(valor, contaDestino);
  }

  /**
   * Obtém o nome do banco.
   * 
   * @return Nome do banco.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Obtém a lista de clientes do banco.
   * 
   * @return Lista de clientes.
   */
  public List<Cliente> getClientes() {
    return clientes;
  }
}
