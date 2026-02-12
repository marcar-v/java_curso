package p08_oop;

import p08_oop_classesExercises.Animal;

public class Inheritance {
    public static void main(String[] args) {

        var cat = new Cats("Eme");
        cat.eat();

        var bird = new Lizzard("Wizard");
        bird.eat();

    }

    public static class Lizzard extends Animal {

        public Lizzard(String name) {
            super(name);
        }
    }

    public static class Cats extends Animal {
        public Cats(String name) {
            super(name);
        }
    }
}
