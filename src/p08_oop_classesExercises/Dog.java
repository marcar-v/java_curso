package p08_oop_classesExercises;

public class Dog extends Animal{
    String sound = "Guau";
    int age;

    public Dog(String name) {
        super(name);
    }
    public void bark(){
        System.out.println(sound);
    }
    @Override
    public void eat(){
        System.out.println("El perro llamado " + super.name + " está comiendo");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
