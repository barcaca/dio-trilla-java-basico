import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set<Tarefa> tarefasSet;
  public ListaTarefas() {
    this.tarefasSet = new HashSet<>();
  }
  public void adicionarTarefa(String descricao){
    Tarefa tarefa = new Tarefa(descricao);
    this.tarefasSet.add(tarefa);
  }
  public void removerTarefa(String descricao){
    Tarefa tarefaParaRemover = null;
    if (!tarefasSet.isEmpty()) {
      for (Tarefa t : this.tarefasSet) {
        if(t.getDescricao().equalsIgnoreCase(descricao)){
          tarefaParaRemover = t;
          break;
        }
      }
      tarefasSet.remove(tarefaParaRemover);
    }else{
      System.out.println("Não há tarefas cadastradas");
    }
    if (tarefaParaRemover == null) {
      System.out.println("Tarefa não encontrada");
    }
  }
  public void exibirTarefas(){
    if (!tarefasSet.isEmpty()) {
      System.out.println(tarefasSet);
    }else{
      System.out.println("Não há tarefas cadastradas");
    }
  }
  public int contarTarefas(){
    return this.tarefasSet.size();
  }
  public Set<Tarefa> obterTarefasConcluidas(){
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t : this.tarefasSet) {
      if (t.isConcluida()) {
        tarefasConcluidas.add(t);
      }
    }
    return tarefasConcluidas;
  }
  public Set<Tarefa> obterTarefasPendentes(){
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    for (Tarefa t : this.tarefasSet) {
      if (!t.isConcluida()) {
        tarefasPendentes.add(t);
      }
    }
    return tarefasPendentes;
  }
  public void marcarTarefaConcluida(String descricao){
    Tarefa tarefaParaConcluir = null;
    if (!tarefasSet.isEmpty()) {
      for (Tarefa t : this.tarefasSet) {
        if(t.getDescricao().equalsIgnoreCase(descricao)){
          tarefaParaConcluir = t;
          tarefaParaConcluir.setConcluida(true);
          break;
        }
      }
    }else{
      System.out.println("Não há tarefas cadastradas");
    }
    if (tarefaParaConcluir == null) {
      System.out.println("Tarefa não encontrada");
    }
  }
  public void marcarTarefaPendente(String descricao){
    Tarefa tarefaParaConcluir = null;
    if (!tarefasSet.isEmpty()) {
      for (Tarefa t : this.tarefasSet) {
        if(t.getDescricao().equalsIgnoreCase(descricao)){
          tarefaParaConcluir = t;
          tarefaParaConcluir.setConcluida(false);
          break;
        }
      }
    }else{
      System.out.println("Não há tarefas cadastradas");
    }
    if (tarefaParaConcluir == null) {
      System.out.println("Tarefa não encontrada");
    }
  }

  public void limparListaTarefas(){
    if (tarefasSet.isEmpty()) {
      System.out.println("Não há tarefas cadastradas");
    }else{
      this.tarefasSet.clear();
      System.out.println("Lista de tarefas limpa");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefas
    ListaTarefas listaTarefas = new ListaTarefas();

    // Adicionando tarefas à lista
    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Preparar apresentação");

    // Exibindo as tarefas na lista
    listaTarefas.exibirTarefas();

    // Removendo uma tarefa
    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(listaTarefas.obterTarefasPendentes());

    // Marcando tarefas como concluídas
    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    System.out.println(listaTarefas.obterTarefasConcluidas());

    // Marcando tarefas como pendentes
    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    // Limpando a lista de tarefas
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  }
}
