public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv  smartTv  = new SmartTv();


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();
        System.out.println("volume atual : " + smartTv.volume);

        System.out.println("canal atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("canal atual : " + smartTv.canal);

        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume da TV : " +  smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> : Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> : Tv ligada? " + smartTv.ligada);



    }
}
