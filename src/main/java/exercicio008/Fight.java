package exercicio008;

import java.util.Random;

public class Fight {
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approvalForTheFight;

    public void bookFight(Fighter f1, Fighter f2) {
        if(f1.getCategory().equals(f2.getCategory()) && f1 != f2){
            approvalForTheFight = true;
            challenged = f1;
            challenger = f2;
        } else {
            approvalForTheFight = false;
            challenged = null;
            challenger = null;
        }
    }
    public void fight() {
        if(approvalForTheFight){
            System.out.println("### Desafiado ###");
            challenged.introduce();
            System.out.println("### desafiante ###");
            challenger.introduce();

            Random random = new Random();
            int winner = random.nextInt(3);
            System.out.println("-----------------------");
            switch (winner){
                case 0:
                    System.out.println("Empatou!");
                    challenged.tieTheFight();
                    challenger.tieTheFight();
                    break;
                case 1:
                    System.out.println("O desafiado " + challenged.getName() + " ganhou a luta!");
                    challenged.winTheFight();
                    challenger.loseTheFight();
                    break;
                case 2:
                    System.out.println("O desafiante " + challenger.getName() + " ganhou a luta!");
                    challenged.loseTheFight();
                    challenger.winTheFight();
                    break;
            }
            System.out.println("-----------------------");
        } else {
            System.out.println("Impossivel acontecer a luta");
        }
    }


    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getApprovalForTheFight() {
        return approvalForTheFight;
    }

    public void setApprovalForTheFight(boolean approvalForTheFight) {
        this.approvalForTheFight = approvalForTheFight;
    }
}
