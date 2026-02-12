package p08_oop_classesExercises;

public class Animal {
    final String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("El animal llamado " + name + " está comiendo");
    }

    public void makeSound(){

    }
}
