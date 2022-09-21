package testandoencapsulamento.teste;

public class Main {
    public static void main(String[] args) {
        Steve steve = new Steve(20);
        steve.andar();
        steve.getIdade();
        Actions.tentandoAndar(steve);
    }
}

class Actions{
    public static void tentandoAndar(Pessoa pessoa) {
        pessoa.andar();
    }
}

interface Pessoa {
    void andar();
}

class Steve implements Pessoa {
    private int idade;

    public void getIdade() {
        System.out.println(idade);
    }

    public Steve(int idade) {
        this.idade = idade;
    }

    @Override
    public void andar() {
        System.out.println("Eu consigo andar!");
    }
}