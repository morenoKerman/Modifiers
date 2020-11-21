package sr.unasat.modifiers.app;


import sr.unasat.modifiers.model.Lecturer;
import sr.unasat.modifiers.model.Student;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Student("Moreno", "24 juli 1980", "Java");
        Lecturer lecturer1 = new Lecturer("Clyde", "30 aug 1975", "Databases");

        student1.introduce();
        student1.iLove();

        System.out.println();

        lecturer1.introduce();
        lecturer1.iLove();
        }

}
