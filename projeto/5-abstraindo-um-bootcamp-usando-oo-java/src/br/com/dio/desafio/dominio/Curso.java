package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

  private int cargaHoraria;

  public Curso(String titulo, String descricao, int cargaHoraria) {
    super(titulo, descricao);
    validarCargaHoraria(cargaHoraria);
    this.cargaHoraria = cargaHoraria;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return String.format(
        "Curso\n" + "Titulo: %s\n" + "Descrição: %s\n" + "Carga Horária: %d horas\n", getTitulo(),
        getDescricao(), cargaHoraria);
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }

  private void validarCargaHoraria(int cargaHoraria) {
    if (cargaHoraria < 0) {
      System.err.println("A carga horária não pode ser negativa.");
    }
  }

}
