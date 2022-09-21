package exercicio005;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static String compareNumbers(int numberDrawn, int chosenNumber) {
        if (chosenNumber == numberDrawn) {
            return "Parabens, voce acertou o número!";
        }
        return "Sinto muito, voce errou o número! O número que escolhi é: " + numberDrawn;
    }

    public static void main(String[] args) {
        Random magicNumber = new Random();
        int numberDrawn = magicNumber.nextInt(5);

        Scanner dataInput = new Scanner(System.in);
        System.out.print("Tente adivinhar o número escolhido entre 0 e 5. ");
        int chosenNumber = dataInput.nextInt();

        if(chosenNumber < 0 || chosenNumber > 5) {
            System.out.print("Número inválido! Tente novamente.");
        }else{
            System.out.print(compareNumbers(numberDrawn, chosenNumber));
        }

    }
}
