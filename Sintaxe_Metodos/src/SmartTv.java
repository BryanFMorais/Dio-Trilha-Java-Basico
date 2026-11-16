public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;



    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }



    //aumentar e diminuir volume da smart tv
    public void aumentarVolume(){
        volume++;
        //volume = volume + 1;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    //ligar e desligar da smart tv
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }






}