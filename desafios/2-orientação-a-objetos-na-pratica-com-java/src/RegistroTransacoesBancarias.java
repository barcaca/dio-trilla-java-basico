import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


public class RegistroTransacoesBancarias {
  private List<Transacao> transacoes;

  public RegistroTransacoesBancarias() {
    this.transacoes = new ArrayList<>();
  }

  public void addTransacao(String tipo, double valorTransacao) {
    Transacao transacao = new Transacao(tipo, valorTransacao);
    this.transacoes.add(transacao);
  }

  public static void main(String[] args) {
    RegistroTransacoesBancarias transacoesBancarias = new RegistroTransacoesBancarias();

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
    System.out.println("Saldo: " + saldo);
    System.out.println("Transacoes:");

    for (int i = 0; i < transacoesBancarias.transacoes.size(); i++) {
      Transacao transacao = transacoesBancarias.transacoes.get(i);
      if (transacao.getTipo().equalsIgnoreCase("d")) {
        System.out.println((i + 1) + ". Deposito de " + transacao.getValor());
      } else {
        System.out.println((i + 1) + ". Saque de " + transacao.getValor());
      }
    }

    // Fechamos o scanner para liberar recursos:
    scanner.close();
  }
}
