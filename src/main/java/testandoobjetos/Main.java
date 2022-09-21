package testandoobjetos;

public class Main {
    public static void main(String[] args) {
        Caneta primeiraCaneta = new Caneta();
        primeiraCaneta.modelo = "bic";
        primeiraCaneta.cor = "azul";
        primeiraCaneta.ponta = 0.5f;
        primeiraCaneta.carga = 25;

        primeiraCaneta.tampar();
        primeiraCaneta.scanner();
        primeiraCaneta.rabiscar();

        System.out.println("");
        System.out.print("Esse outro objeto é um estrumento de corda!\n");

        StringInstrument firstInstrument = new StringInstrument();
        firstInstrument.brand = "gibson";
        firstInstrument.numberOfStrings = 6;
        firstInstrument.instrumentModel = "guitarra";
        firstInstrument.isElectronics = true;
        firstInstrument.material = "madeira de carvalho";

        firstInstrument.status();
        firstInstrument.turnOn();
        firstInstrument.play();
    }
}
