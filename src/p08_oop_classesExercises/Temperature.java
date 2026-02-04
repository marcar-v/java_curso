package p08_oop_classesExercises;

public class Temperature {
    private float celsius;

    public void setCelsius(float celsius) {
        if(celsius < -100 || celsius > 100){
            System.out.println("Temperatura fuera de rango");
        } else{
            this.celsius = celsius;
            System.out.println("Hace una temperatura de: " + celsius + "º.");
        }
    }
}
