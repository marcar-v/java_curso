package p08_oop_classesExercises;

public abstract class Shape {
    float height;
    float width;
    float surface;
    float perimeter;

    public Shape(float height, float width){
        this.setHeight(height);
        this.setWidth(width);
    }

    public void setHeight(float height){
        this.height = height;
    }
    public void setWidth(float width){
        this.width = width;
    }

    void surfaceArea(){

    }

    public void setPerimeter(){
        perimeter = (height + width) * 2;
        System.out.println("El perímetro es de: " + perimeter + " cm");
    }
}
