package exercicio012;

import java.util.Scanner;

public class ConversionToBinary {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Digite o número que voce deseja converter para binario. ");
        int number = dataInput.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println("Resultado: " + binary);

    }
}
