package exercicio003;

import java.awt.*;

public class GetScreenSize {
    public static void main(String[] args) {
        var size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        System.out.println("Atual resolução da tela é: " + width + "x" + height);
    }
}
