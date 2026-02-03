package p08_oop_classesExercises;

public class Student {
    int score;

    public Student(int score){
        this.score = score;
    }

    public boolean examPass(){
        if(score >= 60){
            System.out.println("Examen aprobado");
        }
        System.out.println("Examen suspenso");
        return false;
    }
}
