package exercicio014;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Informe uma string: ");
        String word = dataInput.nextLine();
        String palindromo = "";

        for(int i = word.length() -1; i >= 0; i--) {
            palindromo += word.charAt(i);
        }
        if(palindromo.equals(word)) {
            System.out.println("É um palindromo!");
        }else{
            System.out.println("Não é um palindromo");
        }
    }
}
