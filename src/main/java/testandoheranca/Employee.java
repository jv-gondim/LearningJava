package testandoheranca;

public class Employee extends Person {
    private String sector;
    private boolean isWorking;

    public void changeJobs() {
         this.isWorking =! this.isWorking;
    }

    public String getSector() {
        return sector;
    }
    public void setSector() {
        this.sector = sector;
    }
    public boolean getWorking() {
        return isWorking;
    }
    public void setSector(boolean isWorking) {

    }
}
