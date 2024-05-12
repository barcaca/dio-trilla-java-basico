public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    if (volume <= 100) {
      volume++;
    }
  }

  public void diminuirVolume() {
    if (volume >= 0) {
      volume--;
    }
  }

  public void aumentarCanal() {
    if (canal <= 100) {
      canal++;
    }
  }

  public void diminuirCanal() {
    if (canal >= 0) {
      canal--;
    }
  }

  public void trocarCanal(int novoCanal) {
    this.canal = novoCanal;
  }
}
