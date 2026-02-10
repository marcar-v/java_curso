package p08_oop_classesExercises;

public class Vehicle {
    String brand;
    String model;
    int speed;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void showData(){
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
    }

    public void accelerate(int amount){
        speed = amount + speed;
        if(speed > 120){
            speed = 120;
            System.out.println("La velocidad no puede superar 120. La velocidad es de: " + speed);
        } else {
            System.out.println("La velocidad ha aumentado a: " + speed);
        }
    }

    public void brake(int amount){
        speed = speed - amount;
        if(speed <= 0){
            System.out.println("La velocidad es cero");
        } else {
            System.out.println("La velocidad actual es de: " + speed);
        }
    }
}
