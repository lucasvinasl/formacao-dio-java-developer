package dio;

public class Tv {
    private boolean ligado;
    private int canal;
    private int volume;

    public Tv(){

    }

    public void ligar(){
        this.ligado = true;
        System.out.println("TV ligada");
    }

    public void desligar(){
        this.ligado = false;
        System.out.println("TV desligada");
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Volume aumentado para " + this.volume);
    }

    public void diminuirVolume(){
        this.volume--;
        System.out.println("Volumne baixado para " + this.volume);
    }

    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Canal mudado para " + this.canal);
    }
}
