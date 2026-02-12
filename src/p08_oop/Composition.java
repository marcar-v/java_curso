package p08_oop;

public class Composition {
    public static void main(String [] args) {
        //Composición
        var car = new Car();
        car.turnOnCar();

    }

    public static class Engine{
        private void turnOn(){
            System.out.println("Motor encendido");
        }
    }

    public static class Car{
        final private Engine engine = new Engine();

        public void turnOnCar(){
            engine.turnOn();
        }
    }
}
