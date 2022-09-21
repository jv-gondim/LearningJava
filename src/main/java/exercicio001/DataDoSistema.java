package exercicio001;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataDoSistema {
    public static void main(String[] args) {
        var clock = LocalDateTime.now();
        var formatter =DateTimeFormatter.ofPattern("HH:mm");
        System.out.print("A hora atual é " + clock.format(formatter));
    }
}
