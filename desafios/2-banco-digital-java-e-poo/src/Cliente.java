import java.util.ArrayList;
import java.util.List;

/**
 * A classe Cliente representa um cliente do banco com nome, CPF e suas contas associadas.
 */
public class Cliente {
  private String nome;
  private String cpf;
  private List<Conta> contas;

  /**
   * Construtor da classe Cliente.
   * 
   * @param nome Nome do cliente.
   * @param cpf CPF do cliente.
   */
  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
    this.contas = new ArrayList<>();
  }

  /**
   * Adiciona uma conta à lista de contas do cliente.
   * 
   * @param conta Conta a ser adicionada.
   */
  public void adicionarConta(Conta conta) {
    contas.add(conta);
  }

  /**
   * Remove uma conta da lista de contas do cliente.
   * 
   * @param conta Conta a ser removida.
   */
  public void removerConta(Conta conta) {
    contas.remove(conta);
  }

  /**
   * Obtém o nome do cliente.
   * 
   * @return Nome do cliente.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Define o nome do cliente.
   * 
   * @param nome Novo nome do cliente.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Obtém o CPF do cliente.
   * 
   * @return CPF do cliente.
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * Imprime as informações do cliente, incluindo suas contas associadas.
   * 
   * @return String com as informações do cliente.
   */
  public String imprimirInformacoes() {
    StringBuilder sb = new StringBuilder();
    sb.append("Nome: ").append(nome).append("\n");
    sb.append("CPF: ").append(cpf).append("\n");
    sb.append("Contas:\n");
    for (Conta conta : contas) {
      sb.append(" Conta: ").append(conta.getNumero()).append("\n");
      sb.append(" Tipo: ")
          .append(conta instanceof ContaCorrente ? "Conta Corrente" : "Conta Poupança")
          .append("\n");
      sb.append(" Agência: ").append(conta.getAgencia()).append("\n");
      sb.append(" Saldo: ").append(conta.getSaldo()).append("\n");
      sb.append("\n");
    }
    return sb.toString();
  }
}
