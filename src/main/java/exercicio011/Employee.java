package exercicio011;

public class Employee {
    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float salaryReadjustment() {
        if (salary > 600) {
            return calSalaryReadjustment(salary, ADJUSTMENT_VALUE_PERCENTAGE.TEN);
        } else if (salary > 300) {
            return calSalaryReadjustment(salary, ADJUSTMENT_VALUE_PERCENTAGE.FIFTEEN);
        } else if (salary > 150) {
            return calSalaryReadjustment(salary, ADJUSTMENT_VALUE_PERCENTAGE.TWENTY);
        } else if (salary > 0) {
            return calSalaryReadjustment(salary, ADJUSTMENT_VALUE_PERCENTAGE.TWENTY_FIVE);
        }

        return 0;
    }

    private float calSalaryReadjustment(float salary, ADJUSTMENT_VALUE_PERCENTAGE readjustmentInPercentage) {
        float reajuste_em_inteiro = (float) readjustmentInPercentage.value / 100;
        float valor_a_ser_reajustado_no_salario = salary * reajuste_em_inteiro;
        return salary + valor_a_ser_reajustado_no_salario;
    }

    public void showMessenger(float newSalary) {
        System.out.println("Senhor " + name + " seu salario atual é " + salary + "  mas, seu novo salario é " + newSalary + " e a difrença entre eles é de: " + (newSalary - salary));
    }
}

enum ADJUSTMENT_VALUE_PERCENTAGE {
    TEN(10),
    FIFTEEN(15),
    TWENTY(20),
    TWENTY_FIVE(25);

    public final int value;

    ADJUSTMENT_VALUE_PERCENTAGE(int i) {
        value = i;
    }
}