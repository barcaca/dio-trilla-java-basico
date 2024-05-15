import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> contagemPalavrasMap;

  public ContagemPalavras() {
    this.contagemPalavrasMap = new HashMap<>();
  }

  public void adicionarPalavras(String palavra, Integer contagem) {
    this.contagemPalavrasMap.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    if (!contagemPalavrasMap.isEmpty()) {
      this.contagemPalavrasMap.remove(palavra);
    } else {
      System.out.println("Não há palavras para remover");
    }
  }

  public int exibirContagemPalavras() {
    int contagemTotal = 0;
    for (int contagem : contagemPalavrasMap.values()) {
      contagemTotal += contagem;
    }
    return contagemTotal;
  }

  public String encontrarPalavrasMaisFrequente() {
    String linguagemMaisFrequente = null;
    int maiorContagem = 0;
    for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        linguagemMaisFrequente = entry.getKey();
      }
    }
    return linguagemMaisFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavras contagemLinguagens = new ContagemPalavras();

    // Adiciona linguagens e suas contagens
    contagemLinguagens.adicionarPalavras("Java", 2);
    contagemLinguagens.adicionarPalavras("Python", 8);
    contagemLinguagens.adicionarPalavras("JavaScript", 1);
    contagemLinguagens.adicionarPalavras("C#", 10);

    // Exibe a contagem total de linguagens
    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

    // Encontra e exibe a linguagem mais frequente
    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
  }
}
