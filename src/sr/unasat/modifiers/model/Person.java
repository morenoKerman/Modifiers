package sr.unasat.modifiers.model;

abstract class Person {
    private final String name;
    private final String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void introduce(){
        System.out.println("My name is " + name + "\n" + "Birthdate is " + dob);
    }

    abstract void iLove();



}
