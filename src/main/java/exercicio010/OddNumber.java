package exercicio010;

import java.util.Scanner;

public class OddNumber {
    public static void main (String[] argvs) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Por favor, digite um numero inteiro: ");
        int firstNumber = dataInput.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int secondNumber = dataInput.nextInt();

        if(firstNumber < secondNumber) {
            while(firstNumber <= secondNumber) {
                if (firstNumber % 2 == 1) {
                    System.out.println(firstNumber);
                }
                firstNumber++;
            }
        }else{
            while(firstNumber >= secondNumber) {
                if(secondNumber % 2 == 1) {
                    System.out.println(secondNumber);
                }
                secondNumber++;
            }
        }
    }
}
