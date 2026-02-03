package p08_oop_classesExercises;

public class Rectangle {
    float height;
    float width;
    float surface;
    float perimeter;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void surfaceArea(){
        surface = height * width;
        System.out.println("El área es: " + surface + " cm cuadrados");
    }

    public void setPerimeter(){
        perimeter = (height + width) * 2;
        System.out.println("El perímetro es de: " + perimeter + " cm");
    }
}
