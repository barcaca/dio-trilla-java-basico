import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite){
    Convidado convidado = new Convidado(nome, codigoConvite);
    this.convidadosSet.add(convidado);

  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite){
    Convidado convidadoParaRemover = null;
    if (!convidadosSet.isEmpty()) {
      for (Convidado c : convidadosSet) {
        if (c.getCodigoConvite() == codigoConvite) {
          convidadoParaRemover = c;
          break;
        }
      }
      convidadosSet.remove(convidadoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public int contarConvidados(){
    return this.convidadosSet.size();
  }

  public void exibirConvidados(){
    if (!convidadosSet.isEmpty()) {
      System.out.println(convidadosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe ConjuntoConvidados
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    // Exibindo o número de convidados no conjunto (deve ser zero)
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    // Adicionando convidados ao conjunto
    conjuntoConvidados.adicionarConvidado("João", 1);
    conjuntoConvidados.adicionarConvidado("Maria", 2);
    conjuntoConvidados.adicionarConvidado("José", 3);
    conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

    // Exibindo os convidados no conjunto
    System.out.println("Convidados no conjunto:");
    conjuntoConvidados.exibirConvidados();

    // Removendo um convidado do conjunto por código de convite
    conjuntoConvidados.removerConvidadoPorCodigoConvite(1);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

     // Exibindo os convidados atualizados no conjunto
     System.out.println("Convidados no conjunto após a remoção:");
     conjuntoConvidados.exibirConvidados();
  }
}
