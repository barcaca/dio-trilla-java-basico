import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Integer> numeroLista;

  public SomaNumeros() {
    this.numeroLista = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeroLista.add(numero);
  }

  public int calcularSoma() {
    int soma = 0;
    if (!numeroLista.isEmpty()) {
      for (Integer numero : numeroLista) {
        soma += numero;
      }
      return soma;
    } else {
      throw new RuntimeException("Numero de Lista vazia!");
    }
  }

  public int encontrarMaiorNumero() {
    int maiorNumero = Integer.MIN_VALUE;
    if (!numeroLista.isEmpty()) {
      for (Integer numero : numeroLista) {
        if (numero > maiorNumero) {
          maiorNumero = numero;
        }
      }
      return maiorNumero;
    } else {
      throw new RuntimeException("Numero de Lista vazia!");
    }
  }

  public int encontrarMenorNumero() {
    int menorNumero = Integer.MAX_VALUE;
    if (!numeroLista.isEmpty()) {
      for (Integer numero : numeroLista) {
        if (numero < menorNumero) {
          menorNumero = numero;
        }
      }
      return menorNumero;
    } else {
      throw new RuntimeException("Numero de Lista vazia!");
    }
  }

  public void exibirNumeros() {
    if (!numeroLista.isEmpty()) {
      System.out.println(this.numeroLista);
    } else {
      throw new RuntimeException("Numero de Lista vazia!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando números à lista
    somaNumeros.adicionarNumero(1);
    somaNumeros.adicionarNumero(2);

    // Exibindo a lista de números adicionados
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());

    // Adicionando números à lista
    somaNumeros.adicionarNumero(3);
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(3);
    somaNumeros.adicionarNumero(7);

    // Exibindo a lista de números adicionados
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
  }
}
