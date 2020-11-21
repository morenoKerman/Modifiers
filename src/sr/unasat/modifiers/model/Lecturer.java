package sr.unasat.modifiers.model;

public class Lecturer extends Person{

    private final String favoriteCourse;

    public Lecturer(String name, String dob, String favoriteCourse) {
        super(name, dob);
        this.favoriteCourse = favoriteCourse;
    }

    @Override
    public void iLove() {
        System.out.println("I teaching " + favoriteCourse);
    }
}
