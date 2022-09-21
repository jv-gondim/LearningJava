package exercicio015;

import java.util.Scanner;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        int delta;
        float x1;
        float x2;

        Scanner dataInput = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        int A = dataInput.nextInt();
        System.out.println("Informe o valor de B: ");
        int B = dataInput.nextInt();
        System.out.println("Informe o valor de C: ");
        int C = dataInput.nextInt();

        if(A != 0) {
            delta = (B*B) - (4*A*C);
            System.out.println("O valor de delta é: " + delta);
            System.out.println("");

            if(delta >= 0) {
                x1 = (float) (( -B + (Math.sqrt (delta))) / ( 2*A ));
                x2 = (float) (( -B - (Math.sqrt (delta) ) ) / ( 2*A ));

                System.out.println("O valor de x1 é: " + x1);
                System.out.println("O valor de x2 é: " + x2);
            } else {
                System.out.print("Impossivel realizar conta!");
            }
        } else {
            System.out.print("Ipossivel realizar conta!");
        }
    }
}
