public class Main {
  public static void main(String[] args) {
    Cliente luan = new Cliente();
    luan.setNome("Luan");
    Conta cc = new ContaCorrente(luan);
    Conta cp = new ContaPoupanca(luan);
    cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
  }
}
