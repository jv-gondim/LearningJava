package testandoheranca;

public class Student extends Person {
    private boolean registration;
    private String course;

    public void unregister() {
        this.registration = false;
        System.out.println("A matricula foi cancelada.");

    }

    public boolean getRegistration() {
        return registration;
    }
    public void setRegistration(boolean registration) {
        this.registration = registration;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}
