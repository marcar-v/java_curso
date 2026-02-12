package p08_oop_classesExercises;

public class Manager extends Worker {

    String deparment;

    public Manager(String name, float salary, String department) {
        super(name, salary);
        this.deparment = department;
    }
}
