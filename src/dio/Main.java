package dio;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();

        tv.ligar();
        tv.mudarCanal(100);
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.desligar();
    }
}