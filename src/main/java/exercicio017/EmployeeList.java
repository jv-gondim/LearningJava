package exercicio017;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
    public static void calculo(ArrayList<Float> listaDeSalario, float mediaSalarial) {
        int quantidadeAcimaDaMedia = 0;

        for(int i = 0; i < listaDeSalario.toArray().length; i++) {
            if(listaDeSalario.get(i) > mediaSalarial) {
                quantidadeAcimaDaMedia++;
            }
        }
        System.out.println("Existe " + quantidadeAcimaDaMedia + " funcionario(s) ganhando acima da média>");
    }

    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionarios: ");
        int quantidadeDeFuncionarios = dataInput.nextInt();

        ArrayList<Float> salarios = new ArrayList<Float>();
        float sum = 0.0f;
        for(int i = 0; i < quantidadeDeFuncionarios; i++) {
            System.out.println("Digite o sálario do funcionario: ");
            float salario = dataInput.nextFloat();
            salarios.add(salario);
            sum += salario;
        }

        float media = sum / quantidadeDeFuncionarios;
        calculo(salarios, media);
    }
}
