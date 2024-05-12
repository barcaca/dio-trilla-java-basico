package com.iphone.devices;

import com.iphone.interfaces.AparelhoTelefonico;
import com.iphone.interfaces.NavegadorInternet;
import com.iphone.interfaces.ReprodutorMusical;
import com.iphone.models.Chamada;
import com.iphone.models.Musica;
import com.iphone.models.Web;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
  @Override
  public void tocar() {
    System.out.println("Tocando música...");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música...");
  }

  @Override
  public void selecionarMusica(Musica musica) {
    System.out.println("Selecionando música: " + musica.getTitulo());
    tocar();
  }

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para: " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo chamada...");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba(String url) {
    System.out.println("Adicionando nova aba: " + url);
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  }

  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    Musica musica = new Musica("Stairway to Heaven", "Led Zeppelin");
    Web paginaWeb = new Web("www.example.com");
    Chamada chamada = new Chamada("123456789");
    ReprodutorMusical itunnes = iphone;
    AparelhoTelefonico itelefone = iphone;
    NavegadorInternet safari = iphone;

    System.out.println("Musica");
    itunnes.selecionarMusica(musica);
    itunnes.pausar();
    System.out.println();

    System.out.println("Chamada");
    itelefone.ligar(chamada.getNumero());
    itelefone.atender();
    itelefone.iniciarCorreioVoz();
    System.out.println();

    System.out.println("Pagina Web");
    safari.exibirPagina(paginaWeb.getUrl());
    safari.adicionarNovaAba(paginaWeb.getUrl());
    safari.atualizarPagina();
    System.out.println();

  }
}
