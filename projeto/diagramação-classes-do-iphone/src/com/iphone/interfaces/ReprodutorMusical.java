package com.iphone.interfaces;

import com.iphone.models.Musica;

public interface ReprodutorMusical {
  void tocar();

  void pausar();

  void selecionarMusica(Musica musica);
}
