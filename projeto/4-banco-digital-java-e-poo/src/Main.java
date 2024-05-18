public class Main {
  public static void main(String[] args) {
    Banco banco = new Banco("Banco Digital");

    Cliente cliente1 = new Cliente("João Silva", "111.111.111-11");
    Cliente cliente2 = new Cliente("Maria Oliveira", "222.222.222-22");

    banco.abrirContaCorrente(cliente1);
    banco.abrirContaPoupanca(cliente2);

    // Procurar e imprimir informações do cliente pelo CPF
    banco.imprimirInformacoesClientePorCPF("111.111.111-11");
    banco.imprimirInformacoesClientePorCPF("333.333.333-33"); // CPF não cadastrado
  }
}
