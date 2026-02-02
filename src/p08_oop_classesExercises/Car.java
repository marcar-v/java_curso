package p08_oop_classesExercises;

public class Car {
    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void showData(){
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
    }
}
