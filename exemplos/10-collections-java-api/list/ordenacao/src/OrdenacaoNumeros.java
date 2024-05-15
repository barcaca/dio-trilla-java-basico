import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  private List<Integer> numerosList;

  public OrdenacaoNumeros() {
    this.numerosList = new ArrayList<>();
  }

  public List<Integer> getNumerosList() {
    return numerosList;
  }

  public void adicionarNumero(int numero) {
    this.numerosList.add(numero);
  }

  public List<Integer> ordenarAscendente() {
    List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
    if (!numerosList.isEmpty()) {
      Collections.sort(numerosAscendente);
      return numerosAscendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Integer> ordenarDescendente() {
    List<Integer> numerosDescendente = new ArrayList<>(this.numerosList);
    if (!numerosList.isEmpty()) {
      numerosDescendente.sort(Collections.reverseOrder());
      return numerosDescendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
    ordenacaoNumeros.adicionarNumero(3);
    ordenacaoNumeros.adicionarNumero(1);
    ordenacaoNumeros.adicionarNumero(4);
    ordenacaoNumeros.adicionarNumero(2);
    ordenacaoNumeros.adicionarNumero(5);
    ordenacaoNumeros.adicionarNumero(-5);

    ordenacaoNumeros.ordenarAscendente();
    ordenacaoNumeros.ordenarDescendente();
  }

}
