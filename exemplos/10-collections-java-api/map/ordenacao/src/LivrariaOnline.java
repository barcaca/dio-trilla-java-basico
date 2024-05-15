import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
  private Map<String, Livro> livrariaMap;

  public LivrariaOnline() {
    this.livrariaMap = new HashMap<>();
  }

  public void adicionarLivro(String link, String titulo, String autor, double preco) {
    Livro livro = new Livro(titulo, autor, preco);
    this.livrariaMap.put(link, livro);
  }

  public void removerLivro(String titulo) {
    List<String> chavesRemover = new ArrayList<>();
    if (!livrariaMap.isEmpty()) {
      for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
        if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
          chavesRemover.add(entry.getKey());
        }
      }
      for (String chave : chavesRemover) {
        this.livrariaMap.remove(chave);
      }
    }
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
    List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco =
        new ArrayList<>(livrariaMap.entrySet());
    Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
    Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
    for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
      livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
    }
    return livrosOrdenadosPorPreco;
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
    List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor =
        new ArrayList<>(livrariaMap.entrySet());
    Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
    Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
    for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
      livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
    }
    return livrosOrdenadosPorAutor;
  }

  public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
    Map<String, Livro> livroPorAutor = new LinkedHashMap<>();
    for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      Livro livro = entry.getValue();
      if (livro.getAutor().equalsIgnoreCase(autor)) {
        livroPorAutor.put(entry.getKey(), livro);
      }
    }
    return livroPorAutor;
  }

  public List<Livro> obterLivroMaisCaro() {
    List<Livro> livrosMaisCaros = new ArrayList<>();
    double precoMaisAlto = Double.MIN_VALUE;
    if (!livrariaMap.isEmpty()) {
      for (Livro livro : livrariaMap.values()) {
        if (livro.getPreco() > precoMaisAlto) {
          precoMaisAlto = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }
    for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      if (entry.getValue().getPreco() == precoMaisAlto) {
        Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
        livrosMaisCaros.add(livroComPrecoMaisAlto);
      }
    }
    return livrosMaisCaros;
  }

  public List<Livro> obterLivroMaisBarato() {
    List<Livro> livrosMaisBaratos = new ArrayList<>();
    double precoMaisBarato = Double.MAX_VALUE;
    if (!livrariaMap.isEmpty()) {
      for (Livro livro : livrariaMap.values()) {
        if (livro.getPreco() < precoMaisBarato) {
          precoMaisBarato = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }
    for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      if (entry.getValue().getPreco() == precoMaisBarato) {
        Livro livroComPrecoMaisBarato = livrariaMap.get(entry.getKey());
        livrosMaisBaratos.add(livroComPrecoMaisBarato);
      }
    }
    return livrosMaisBaratos;
  }

  public static void main(String[] args) {
    LivrariaOnline livrariaOnline = new LivrariaOnline();
    // Adiciona os livros à livraria online
    livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos",
        "George Orwell", 7.05d);
    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6",
        "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum",
        "Agatha Christie", 50d);
    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente",
        "Agatha Christie", 5d);

    // Exibe todos os livros ordenados por preço
    System.out
        .println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

    // Exibe todos os livros ordenados por autor
    System.out
        .println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

    // Pesquisa livros por autor
    String autorPesquisa = "Josh Malerman";
    livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

    // Obtém e exibe o livro mais caro
    System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

    // Obtém e exibe o livro mais barato
    System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

    // Remover um livro pelo título
    livrariaOnline.removerLivro("1984");
    System.out.println(livrariaOnline.livrariaMap);
  }
}
