package p08_oop_classesExercises;

public class Rectangle extends Shape{

    public Rectangle(float height, float width) {
        super(height, width);
    }

    @Override
    public void surfaceArea() {
        surface = height * width;
        System.out.println("El área es: " + surface + " cm cuadrados");
    }
}
