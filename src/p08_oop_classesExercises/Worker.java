package p08_oop_classesExercises;

public class Worker {
    String name;
    float salary;

    public Worker(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(){
        System.out.println(salary + "€");
    }
}
