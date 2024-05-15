import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> alunosSet;

  public GerenciadorAlunos() {
    this.alunosSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, long matricula, double nota) {
    Aluno aluno = new Aluno(nome, matricula, nota);
    this.alunosSet.add(aluno);
  }

  public void removerAlunoPorMatricula(long matricula) {
    Aluno alunoParaRemover = null;
    if (!alunosSet.isEmpty()) {
      for (Aluno a : alunosSet) {
        if (a.getMatricula() == matricula) {
          alunoParaRemover = a;
          break;
        }
      }
      if (alunoParaRemover != null) {
        this.alunosSet.remove(alunoParaRemover);
      } else {
        System.out.println("Matricula não encontrada!");
      }

    } else {
      System.out.println("Nenhum aluno cadastrado!");
    }
  }

  public Set<Aluno> exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new HashSet<>(alunosSet);
    return alunosPorNome;
  }

  public Set<Aluno> exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
    alunosPorNota.addAll(alunosSet);
    return alunosPorNota;
  }

  public void exibirAlunos() {
    if (!alunosSet.isEmpty()) {
      System.out.println(alunosSet);
    } else {
      System.out.println("Nenhum aluno cadastrado!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância do GerenciadorAlunos
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // Adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

    // Exibindo todos os alunos no gerenciador
    System.out.println("Alunos no gerenciador:");
    System.out.println(gerenciadorAlunos.alunosSet);

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    gerenciadorAlunos.removerAlunoPorMatricula(000L);
    gerenciadorAlunos.removerAlunoPorMatricula(123457L);

    // Exibindo todos os alunos no gerenciador
    System.out.println("Alunos no gerenciador:");
    gerenciadorAlunos.exibirAlunos();

    // Exibindo alunos ordenados por nome
    System.out.println("Alunos ordenados por nome : \n" + gerenciadorAlunos.exibirAlunosPorNome());

    // Exibindo alunos ordenados por nota
    System.out.println("Alunos ordenados por nota : \n" + gerenciadorAlunos.exibirAlunosPorNota());


  }
}
