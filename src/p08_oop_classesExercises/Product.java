package p08_oop_classesExercises;

public class Product {
    float price;

    public Product(float price){
        this.price = price;
    }

    public void applyDiscount(float discount){
        if(discount > 0){
            float finalPrice;
            finalPrice = price - discount;
            System.out.println("El precio con descuento es de: " + finalPrice + "€");
        }
        else {
            System.out.println("El producto no tiene descuento. El precio es de: " + price + "€");
        }
    }
}
