package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

  private LocalDate data = LocalDate.now();

  public Mentoria(String titulo, String descricao) {
    super(titulo, descricao);
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return String.format("Mentoria\n" + "Titulo: %s\n" + "Descrição:%s\n" + "Data: %s\n",
        getTitulo(), getDescricao(), data);
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + 20d;
  }

}
