package p08_oop_classesExercises;

public class Rectangle {
    float height;
    float width;
    float surface;
    float perimeter;

    public Rectangle(float height, float width){
        this.setHeight(height);
        this.setWidth(width);
    }

    public void setHeight(float height){
        this.height = height;
    }
    public void setWidth(float width){
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
