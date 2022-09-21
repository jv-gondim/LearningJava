package exercicio004;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int firstNumber = dataInput.nextInt();

        System.out.print("Digite o segundo número: ");
        int secondNumber = dataInput.nextInt();

        if(firstNumber <= 0 || secondNumber <= 0){
            System.out.print("Número inválido. Tente novamente!");
        } else {
            System.out.printf("A soma entre os números é: %d \n", firstNumber + secondNumber );
            System.out.printf("A subtração entre os números é: %d \n", firstNumber - secondNumber);
            System.out.printf("A multiplicação entre os números é: %d \n", firstNumber * secondNumber);
            System.out.printf("A divisão entre os números é: %d \n", firstNumber / secondNumber);
        }
    }
}
