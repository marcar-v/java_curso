package p08_oop;

import java.util.zip.GZIPOutputStream;

public class Abstraction {
    public static void main(String [] args) {


        // Clase abstracta

        //var myAnimal = new Animal(); <--No se puede implementar porque la clase abstracta "oculta" la clase padre

        var myDog = new Dog();
        myDog.makeSound();

        var myCat = new Cat();
        myCat.makeSound();

        // Interface
        var myBird = new Bird();
        myBird.fly();

        var myBat = new Bat();
        myBat.fly();

    }


    //Clase abstracta

    public static abstract class Animal{

        public abstract void makeSound();

        public void sleep(){
            System.out.println("El animal está durmiendo");
        }
    }

    public static class Dog extends Animal{

        @Override
        public void makeSound() {
            System.out.println("El perro ladra");
        }
    }

    public static class Cat extends Animal{

        @Override
        public void makeSound() {
            System.out.println("El gato maúlla");
        }
    }

    // Interface

    public interface Flying {
        void fly();
    }

    public static class Bird extends Animal implements Flying{

        @Override
        public void makeSound() {
            System.out.println("El pájaro pía");
        }

        @Override
        public void fly() {
            System.out.println("El pájaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying{

        @Override
        public void makeSound() {
            System.out.println("El murciélago solo hace ruido");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }
    }
}
