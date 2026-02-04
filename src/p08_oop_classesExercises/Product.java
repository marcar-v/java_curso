package p08_oop_classesExercises;

public class Product {
    private float price;

    public Product(float price){
        this.setPrice(price);
    }

    public void setPrice(float price) {
        if(price <= 0){
            System.out.println("El precio debe ser mayor que 0");
        } else{
            this.price = price;
        }
    }

    public void applyDiscount(float discount){
        if(discount <= 0){
            System.out.println("El producto no tiene descuento. El precio es de: " + price + "€");
        }
        else {
            float finalPrice;
            finalPrice = price - discount;
            System.out.println("El precio con descuento es de: " + finalPrice + "€");
        }
    }


}
