package p08_oop_classesExercises;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("El gato llamado " + super.name + " está comiendo.");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
