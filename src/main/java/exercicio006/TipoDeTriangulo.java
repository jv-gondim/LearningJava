package exercicio006;

import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Olá operador. Esse programa serve para descobrir o tipo de um retangulo.");
        System.out.print("Por favor, informe o valor do primeiro ângulo adjacente. ");
        float firstAdjacentAngle = dataInput.nextFloat();

        System.out.print("Informe o valor do segundo ângulo adjacente. ");
        float secondAdjacentAngle = dataInput.nextFloat();

        System.out.print("Informe o valor da base do triangulo. ");
        float base = dataInput.nextFloat();

        if (firstAdjacentAngle == secondAdjacentAngle && firstAdjacentAngle == base && secondAdjacentAngle == base) {
            System.out.print("O tipo de triangulo é equilátero.");
        } else if (firstAdjacentAngle == secondAdjacentAngle) {
            System.out.print("O tipo de triangulo é isósceles.");
        } else if (firstAdjacentAngle != secondAdjacentAngle && firstAdjacentAngle != base && secondAdjacentAngle != base) {
            System.out.print("O tipo de triangulo é escaleno.");
        }else if(firstAdjacentAngle == 0 || secondAdjacentAngle == 0 || base == 0){
            System.out.print("Dados invalidos, tente novamente.");
        }

    }
}
