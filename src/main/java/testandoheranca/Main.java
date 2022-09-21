package testandoheranca;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();
        Person fourthPerson = new Person();

        firstPerson.setName("Pedro");
        secondPerson.setName("Julio");
        thirdPerson.setName("Juliana");
        fourthPerson.setName("Mariana");

        System.out.println(firstPerson.toString());
        System.out.println(secondPerson.toString());
        System.out.println(thirdPerson.toString());
        System.out.println(fourthPerson.toString());

    }
}
