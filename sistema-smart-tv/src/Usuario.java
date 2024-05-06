public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.trocarCanal(13);
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
    }
}
