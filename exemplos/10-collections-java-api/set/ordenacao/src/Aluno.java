import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
  private String nome;
  private long matricula;
  private double nota;

  public Aluno(String nome, long matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  }

  @Override
  public int compareTo(Aluno a) {
    return nome.compareToIgnoreCase(a.getNome());
  }

  public String getNome() {
    return nome;
  }

  public long getMatricula() {
    return matricula;
  }

  public double getNota() {
    return nota;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, matricula);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Aluno))
      return false;
    Aluno other = (Aluno) obj;
    return Objects.equals(nome, other.nome) && matricula == other.matricula;
  }

  @Override
  public String toString() {
    return "Aluno \n[nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]\n";
  }

}


class ComparatorPorNota implements Comparator<Aluno> {

  @Override
  public int compare(Aluno a1, Aluno a2) {
    return Double.compare(a1.getNota(), a2.getNota());
  }

}
