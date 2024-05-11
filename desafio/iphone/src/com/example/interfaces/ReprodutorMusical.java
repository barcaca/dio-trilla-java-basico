package com.example.interfaces;

import com.example.model.Musica;

public interface ReprodutorMusical {
  void tocar();

  void pausar();

  void selecionarMusica(Musica musica);

  void adicionarMusica(Musica musica);
}
