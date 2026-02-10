package p08_oop_classesExercises;

public class Worker {
    String name;
    float salary;

    public Worker(String name, float salary){
        this.name = name;
        this.setSalary(salary);
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public void raiseSalary(float percent){
        if(percent <= 0){
            System.out.println("El salario no sube. Es de: " + salary);
        } else {
            salary = salary + percent;
            System.out.println("El salario es de: " + salary);
        }
    }
}
