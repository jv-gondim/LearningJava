package exercicio009;

public class Main {
    public static void main(String[] args) {
        Person pessoa[] = new Person[2];

        pessoa[0] = new Person("Julio", 22, "Masculino");
        pessoa[1]= new Person("Mariana", 22, "Feminino");

        Book livro[] = new Book[3];

        livro[0] = new Book("A arte da guerra", "Sun Tzo", 318, pessoa[0]);
        livro[1] = new Book("StormLight", "Brandon Sanderson", 1289, pessoa[1]);
        livro[2] = new Book("Tudo o que voce presisou desaprender para se tornar um idiota", "Meteoro Brasil", 234, pessoa[1]);

        livro[0].open();
        livro[0].details();

    }
}
