public class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.setChassi("824893");
    // jeep.ligar();

    Moto z500 = new Moto();
    z500.setChassi("123456");
    // z500.ligar();

    Veiculo coringa =jeep;
    coringa.ligar();
  }
}
