package p08_oop_classesExercises;

public class Student {
    int score;

    public Student(){
        this.setScore(score);
    }

    public void setScore(int score){
        this.score = score;
    }

    public void examPass(){
        if(score >= 60){
            System.out.println("Examen aprobado");
        } else {
            System.out.println("Examen suspenso");
        }
    }
}
