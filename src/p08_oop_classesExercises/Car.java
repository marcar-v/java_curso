package p08_oop_classesExercises;

public class Car extends Vehicle {

    public Car(String brand, String model) {
        super(brand, model);
    }

    public void honk(){
        System.out.println("Peeep");
    }
}
