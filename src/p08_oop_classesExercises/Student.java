package p08_oop_classesExercises;

import p08_oop.Person;

public class Student extends Person {
    int score;

    public Student(String name, int age, int score){
        super(name, age);
        this.setScore(score);
    }

    public void setScore(int score){
        this.score = score;
    }

    public void study(){
        System.out.println("Estoy estudiando.");
    }

    public void examPass(){
        if(score >= 60){
            System.out.println("Examen aprobado");
        } else {
            System.out.println("Examen suspenso");
        }
    }
}
