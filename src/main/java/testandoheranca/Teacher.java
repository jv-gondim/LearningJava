package testandoheranca;

public class Teacher extends Person {
    private String specializedCourse;
    private float wage;

    public void receiveRaise(float increase) {
        this.wage += increase;
    }

    public String getSpecializedCourse() {
        return specializedCourse;
    }
    public void setSpecializedCourse(String specializedCourse) {
        this.specializedCourse = specializedCourse;
    }
    public float getWage() {
        return wage;
    }
    public void setWage(float wage) {
        this.wage = wage;
    }
}
