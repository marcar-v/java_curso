package p08_oop;

public class Polymorphism {
    // Polimorfismo por herencia (Override)
    // Ejemplos en Inheritance.java

    //Polimorfismo por sobrecarga (sobrecarga de métodos)


    public static void main(String [] main) {
        var calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1.5, 2.5));
    }

    public static class Calculator{
        public int sum(int a, int b){
            return a + b;
        }

        public double sum(double a, double b){
            return a + b;
        }
    }
}
