package exercicio011;

import java.util.Scanner;

public class NovoSalario {

    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Boa tarde, por favor digite seu nome: ");
        employee.setName(dataInput.nextLine());

        System.out.println("Digite sua faixa salarial: ");
        employee.setSalary(dataInput.nextFloat());

        var newSalary = employee.salaryReadjustment();
        if (newSalary == 0) {
            System.out.println("Erro Ao Calcular o Salario, o salaio deve ser maior q zero");
        } else {
            employee.showMessenger(newSalary);
        }
    }
}
