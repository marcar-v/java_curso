package p08_oop;

public class Inheritance {
    public static void main(String[] args) {
        var animal = new Animal("Rata");
        animal.eat();

        var dog = new Dog("Tork", 12);
        dog.eat();

        var cat = new Cat("Belevent");
        cat.eat();

        var bird = new Bird("Pichí");
        bird.fly();

    }

    public static class Animal{
        final private String name;

        public Animal(String name){
            this.name = name;
        }

        public void eat(){
            System.out.println("El animal llamado " + name + " está comiendo");
        }
    }

    public static class Dog extends Animal{
        int age;
        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override
        public void eat(){
            System.out.println("El perro llamado " + super.name + " está comiendo");
        }
    }

    public static class Cat extends Animal{
        public Cat(String name){
            super(name);
        }

        @Override
        public void eat() {
            System.out.println("El gato llamado " + super.name + " está comiendo.");
        }
    }
    public static class Bird extends Animal{
        public Bird(String name){
            super(name);
        }

        public void fly(){
            System.out.println("El pájaro está volando");
        }

    }
}
