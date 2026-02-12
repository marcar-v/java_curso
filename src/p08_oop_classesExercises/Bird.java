package p08_oop_classesExercises;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println("El pájaro está volando");
    }

    @Override
    public void makeSound() {
        System.out.println("Peep");
    }
}
