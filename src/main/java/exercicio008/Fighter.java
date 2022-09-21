package exercicio008;

public class Fighter {
    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int victories;
    private int defeats;
    private int draws;

    public void introduce() {
        System.out.println("----------------------------------------------");
        System.out.println("Temos aqui com nós o lutador " + this.getName());
        System.out.println("Diretamente de " + this.getNationality());
        System.out.println("Com " + this.getAge() + " anos de idade");
        System.out.println("Medindo " + this.getHeight() + " de altura");
        System.out.println("Pesando " + this.getWeight() + " Kilos");
        System.out.println("Possui " + this.getVictories() + " vitorias");
        System.out.println(this.getDefeats() + " derrotas");
        System.out.println("E " + this.getDraws() + " empates");
    }
    public void status() {
        System.out.println(this.getName() + " é da categoria " + this.getCategory());
        System.out.println("Ganhou " + this.getVictories() + " vezes");
        System.out.println("Perdeu " + this.getDefeats() + " vezes");
        System.out.println("Empatou " + this.getDraws() + " vezes");
    }
    public void winTheFight() {
        setVictories(getVictories() + 1);
    }
    public void loseTheFight() {
        setDefeats(getDefeats() + 1);
    }
    public void tieTheFight() {
        setDraws(getDraws() +1);
    }


    public Fighter(String name, String nationality, int age, float height, float weight, int victories, int defeats, int draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victories = victories;
        this.defeats = defeats;
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if(weight < 52.2) {
            this.category = "Invalido";
        } else if(weight <= 70.3) {
            this.category = "Peso Pena";
        } else if(weight <= 83.9) {
            this.category = "Peso Médio";
        } else if(weight <= 120.2) {
            this.category = "Peso Pesado";
        } else {
            this.category = "Invalido";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
