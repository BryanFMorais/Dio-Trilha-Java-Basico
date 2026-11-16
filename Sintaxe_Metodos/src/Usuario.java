public class Usuario {
    public static void main (String[] args){

        SmartTv smartTv = new SmartTv();



        //saida de informações da smart tv
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("volume Atual: " + smartTv.volume);

        //chamando os metodos ligar e desligar
        smartTv.ligar();
        System.out.println("Novo Status TV ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Satus TV ligada ? " + smartTv.ligada);

        //chamando os metodos aumentar e diminuir volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("volume Atual: " + smartTv.volume);

        //chamando os metodos aumentar e diminuir canal
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);



    }
}
