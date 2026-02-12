package p08_oop_classesExercises;

public class Circle extends Shape{
    double area;
    float radio;

    public Circle(float height, float width, float radio) {
        super(height, width);
        this.radio = radio;
    }

    @Override
    public void surfaceArea() {
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área de un circulo de radio "+radio+" es "+area);
    }
}
