package sr.unasat.modifiers.model;

public class Student extends Person{

    private final String favoriteCourse;

    public Student(String name, String dob, String favoriteCourse) {
        super(name, dob);
        this.favoriteCourse = favoriteCourse;
    }

    @Override
    public void iLove() {
        System.out.println("I love studying " + favoriteCourse);
    }
}
