package p08_oop;

import p08_oop_classesExercises.Book;
import p08_oop_classesExercises.Car;
import p08_oop_classesExercises.Dog;

public class ClassesExercises {
    public static void main(String[] args){
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("The Lord of the Rings", "J.R.R.Tolkien", 1930);
        System.out.println(book.title + ", " + book.author);

        // 2. Crea una clase Dog con un metodo bark() que imprima su sonido.
        var dog = new Dog();
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("Twilight", "Stephanie Meyer", 2007);
        var book3 = new Book("The Golden Compass", "Phillip Pullman", 1998);
        book.showBookData();
        book2.showBookData();
        book3.showBookData();

        // 4. Crea una clase Car con atributos brand y model y un metodo showData().
        var myCar = new Car("Toyota", "Auris");
        myCar.showData();

        // 5. Crea una clase Student con atributo score y un metodo que diga si aprobó (mayor o igual a 60).


        // 6. Crea una clase BankAccount con atributo balance y un metodo deposit() que sume el saldo.

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        // 8. Crea una clase Worker que reciba nombre y salario, y un metodo para mostrar su salario.

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        // 10. Crea una clase Product y un metodo que aplique un descuento sobre su precio.

    }

}
