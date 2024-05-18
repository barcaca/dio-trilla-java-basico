import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Transacao {
  private String tipo;
  private double valor;

  public Transacao(String tipo, double valor) {
    this.tipo = tipo;
    this.valor = valor;
  }

  public String getTipo() {
    return tipo;
  }

  public double getValor() {
    return valor;
  }
}


public class RegistroTransacoesComStream {
  private List<Transacao> transacoes;

  public RegistroTransacoesComStream() {
    this.transacoes = new ArrayList<>();
  }

  public void addTransacao(String tipo, double valorTransacao) {
    Transacao transacao = new Transacao(tipo, valorTransacao);
    this.transacoes.add(transacao);
  }

  public void imprimirTransacoes(List<Transacao> transacaos) {
    transacaos.stream()
        .filter(t -> t.getTipo().equalsIgnoreCase("d") || t.getTipo().equalsIgnoreCase("s"))
        .map(t -> t.getTipo() + " de " + t.getValor()).collect(Collectors.toList())
        .forEach(System.out::println);
  }

  public static void main(String[] args) {
    RegistroTransacoesComStream transacoesBancarias = new RegistroTransacoesComStream();

    Scanner scanner = new Scanner(System.in);

    double saldo = scanner.nextDouble();
    int quantidadeTransacoes = scanner.nextInt();

    // TODO: Implemente um loop 'for' para iterar sobre as transações:
    for (int i = 0; i < quantidadeTransacoes; i++) {
      // Aqui é lido o tipo de transação e o valor da transação:
      String tipoTransacao = scanner.next();
      double valorTransacao = scanner.nextDouble();

      // Aqui é verificar o tipo de transação e atualiza o saldo da conta de acordo:
      if (tipoTransacao.equalsIgnoreCase("d")) {
        saldo += valorTransacao;
        transacoesBancarias.addTransacao(tipoTransacao, valorTransacao);
      } else if (tipoTransacao.equalsIgnoreCase("s")) {
        saldo -= valorTransacao;
        transacoesBancarias.addTransacao(tipoTransacao, valorTransacao);
      } else {
        // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
        System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
        i--;
      }
    }

    // Aqui é exibido o saldo final e a lista de transações ao final do processo:
    System.out.println("Saldo : " + saldo);
    System.out.println("Transacoes:");
    transacoesBancarias.imprimirTransacoes(transacoesBancarias.transacoes);

    // Fechamos o scanner para liberar recursos:
    scanner.close();
  }
}
