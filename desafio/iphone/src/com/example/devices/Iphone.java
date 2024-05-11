package com.example.devices;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.interfaces.AparelhoTelefonico;
import com.example.interfaces.NavegadorInternet;
import com.example.interfaces.ReprodutorMusical;
import com.example.model.Musica;

// iPhone.java
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  private ArrayList<Musica> bibliotecaMusical;

  public Iphone() {
    bibliotecaMusical = new ArrayList<>();
  }

  @Override
  public void tocar() {
    if (bibliotecaMusical.isEmpty()) {
      System.out.println("Biblioteca de músicas vazia!");

    } else {
      System.out.println("Tocando música...");
    }
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música...");
  }

  @Override
  public void selecionarMusica(Musica musica) {
    System.out.println("Selecionando música: " + musica.getTitulo() + " - " + musica.getArtista());
    tocar();
  }

  @Override
  public void adicionarMusica(Musica musica) {
    bibliotecaMusical.add(musica);
    System.out.println(
        "Música adicionada à biblioteca: " + musica.getTitulo() + " - " + musica.getArtista());
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

  public void exibirMenuTelefone(Scanner scanner) {
    String[] opcoes = {"Ligar", "Atender chamada", "Iniciar correio de voz"};
    int opcao;
    do {
      System.out.println("\n--- Telefone ---");
      for (int i = 0; i < opcoes.length; i++) {
        System.out.println((i + 1) + ". " + opcoes[i]);
      }
      System.out.println("0. Voltar ao menu principal");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite o número para ligar: ");
          String numero = scanner.next();
          ligar(numero);
          break;
        case 2:
          atender();
          break;
        case 3:
          iniciarCorreioVoz();
          break;
        case 0:
          System.out.println("Voltando ao menu principal...");
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
  }

  public void menuOpcoes(String[] opcoes, String titulo) {
    System.out.println("\n--- " + titulo + " ---");
    for (int i = 0; i < opcoes.length; i++) {
      System.out.println((i + 1) + ". " + opcoes[i]);
    }
    if (titulo == "Menu Principal") {
      System.out.println("0. Sair");
    } else {
      System.out.println("0. Voltar ao menu principal");
    }
    System.out.print("Escolha uma opção: ");
  }

  private void exibirMenuiPod(Scanner scanner) {
    String menu = "iPod";
    String[] opcoes = {"Tocar música", "Pausar música", "Selecionar música", "Adicionar música"};
    int opcao;
    do {
      menuOpcoes(opcoes, menu);
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          tocar();
          break;
        case 2:
          pausar();
          break;
        case 3:
          if (!bibliotecaMusical.isEmpty()) {
            System.out.println("Selecione uma música:");
            for (int i = 0; i < bibliotecaMusical.size(); i++) {
              System.out.println((i + 1) + ". " + bibliotecaMusical.get(i).getTitulo());
            }
            int musicaSelecionada = scanner.nextInt();
            selecionarMusica(bibliotecaMusical.get(musicaSelecionada - 1));
          } else {
            System.out.println("A biblioteca musical está vazia. Adicione músicas primeiro.");
          }
          break;
        case 4:
          System.out.print("Digite o título da música: ");
          String titulo = scanner.next();
          System.out.print("Digite o artista da música: ");
          String artista = scanner.next();
          Musica musica = new Musica(titulo, artista);
          adicionarMusica(musica);
          break;
        case 0:
          System.out.println("Voltando ao menu principal...");
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
  }

  public void exibirMenuSafari(Scanner scanner) {
    String menu = "Safari";
    String[] opcoes = {"Exibir página", "Adicionar nova aba", "Atualizar página"};
    int opcao;
    do {
      menuOpcoes(opcoes, menu);
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite a URL da página: ");
          String url = scanner.next();
          exibirPagina(url);
          break;
        case 2:
          System.out.print("Digite a URL da nova aba: ");
          String novaAba = scanner.next();
          adicionarNovaAba(novaAba);
          break;
        case 3:
          atualizarPagina();
          break;
        case 0:
          System.out.println("Voltando ao menu principal...");
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
  }


  public void exibirMenuPrincipal() {
    Scanner scanner = new Scanner(System.in);
    String menu = "Menu Principal";
    String[] opcoes = {"iPod", "Safari", "Telefone"};
    int opcao;
    do {
      menuOpcoes(opcoes, menu);
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          exibirMenuiPod(scanner);
          break;
        case 2:
          exibirMenuSafari(scanner);
          break;
        case 3:
          exibirMenuTelefone(scanner);
          break;
        case 0:
          System.out.println("Encerrando...");
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
    scanner.close();
  }

  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.exibirMenuPrincipal();

  }
}
