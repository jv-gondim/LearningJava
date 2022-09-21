package exercicio013;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("informe um numero: ");
        int number = dataInput.nextInt();
        int i, resultado = 0;

        for(i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                resultado++;
                break;
            }
        }

        if(resultado == 0) {
            System.out.println("O numero é primo");
        }else{
            System.out.println("O numero não é primo");
        }
    }
}
