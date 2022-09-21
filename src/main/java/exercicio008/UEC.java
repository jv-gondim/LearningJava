package exercicio008;

public class UEC {
    public static void main(String[] args) {
        Fighter fighter[] = new Fighter[6];

        fighter[0] = new Fighter("Pretty Boy", "França", 31, 1.75f, 68.9f,
                                 11, 2, 3);
        fighter[1] = new Fighter("Putscrit", "Brasil", 29, 1.68f, 57.8f,
                                 14, 2, 3);
        fighter[2] = new Fighter("Snapshadow", "EUA", 35, 1.65f, 80.9f,
                                 12, 2, 1);
        fighter[3] = new Fighter("Dead Code", "Austrália", 28, 1.93f, 81.6f,
                                 13, 0, 2);
        fighter[4] = new Fighter("UFOCobol", "Brasil", 37, 1.70f, 119.3f,
                                  10, 4, 3);
        fighter[5] = new Fighter("Nerdaarf", "EUA", 30, 1.81f, 105.7f,
                                 12, 2, 4);
        Fight UEC01 = new Fight();
        UEC01.bookFight(fighter[2], fighter[3]);
        UEC01.fight();
    }
}
