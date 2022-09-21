package exercicio002;

import java.util.Locale;

public class GetLanguage {
    public static void main(String[] args) {
        var locale = Locale.getDefault();
        System.out.println("O idioma do seu sistema está em " + locale.getDisplayLanguage());
    }
}
