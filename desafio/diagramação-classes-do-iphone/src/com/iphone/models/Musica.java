package com.iphone.models;

public class Musica {
  private String titulo;
  private String artista;

  public Musica(String titulo, String artista) {
    this.titulo = titulo;
    this.artista = artista;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }


}
