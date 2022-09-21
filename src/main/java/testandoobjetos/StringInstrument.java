package testandoobjetos;

public class StringInstrument {
    String brand;
    String material;
    int numberOfStrings;
    boolean isElectronics;
    String instrumentModel;

    void status(){
        System.out.println("Esse instrumento é um " + this.instrumentModel + " da marca " + this.brand);
        System.out.println("Seu material é constituido de " + this.material);
        System.out.println("O instrumento possue " + this.numberOfStrings + " cordas.");
    }
    void turnOn(){
        if(isElectronics){
            System.out.println("O intrumento pode ser ligado ao amplificador.");
        }else{
            System.out.println("O instrumeto não é eletronico.");
        }
    }
    void play(){
        System.out.println("Eu consigo fazer musica!");
    }
}
