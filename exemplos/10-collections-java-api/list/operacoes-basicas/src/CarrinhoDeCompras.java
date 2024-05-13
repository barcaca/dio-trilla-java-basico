import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> carrinhoList;

  public CarrinhoDeCompras() {
    this.carrinhoList = new ArrayList<>();
  }
  public void adicionarItem(Item item){
    this.carrinhoList.add(item);
  }
  public void removerItem(String nome){
    List<Item> itemParaRemover = new ArrayList<>();
   if (!carrinhoList.isEmpty()) {
    for (Item item : carrinhoList) {
      if (item.getNome().equalsIgnoreCase(nome)) {
        itemParaRemover.add(item);
      }
    }
    carrinhoList.removeAll(itemParaRemover);
   }else{
    System.out.println("O carrinho está vazio!");
   }
  }
  public double calcularValorTotal(){
    double valorTotal = 0;
    if (!carrinhoList.isEmpty()) {
      for (Item item : carrinhoList) {
        valorTotal += item.getPreco() * item.getQuantidade();
      }
      return valorTotal;
    }else{
      throw new RuntimeException("A lista está vazia!");
    }
    
  }
  public void exibirItens(){
    if (!carrinhoList.isEmpty()) {
      System.out.println(carrinhoList);
    }else{
      System.out.println("Carrinho vazio");
    }
    
  }
  public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    CarrinhoDeCompras carrinhoList = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoList.adicionarItem(new Item("Carne", 20.0d, 2));
    carrinhoList.adicionarItem(new Item("Carne", 20.0d, 2));
    carrinhoList.adicionarItem(new Item("Frango", 10.0d, 1));

    // Exibindo os itens no carrinho
    carrinhoList.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é : R$ " + carrinhoDeCompras.calcularValorTotal());
    
    // Removendo um item do carrinho
    carrinhoList.removerItem("Carne");

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é : R$ " + carrinhoDeCompras.calcularValorTotal());

    // Exibindo os itens no carrinho
    carrinhoList.exibirItens();

  }
}
