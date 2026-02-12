package p08_oop;

import p08_oop_classesExercises.*;

import java.util.ArrayList;

public class ClassesExercises {
    static void main(String[] args){
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("The Lord of the Rings", "J.R.R.Tolkien", 1930);
        book.showBookData();

        // 2. Crea una clase Dog con un metodo bark() que imprima su sonido.
        var dog = new Dog("Mica");
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
        var student = new Student("Juan", 25, 0);
        student.examPass();

        // 6. Crea una clase BankAccount con atributo balance y un metodo deposit() que sume el saldo.
        var account = new BankAccount(106f);
        account.deposit(100);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle(10, 5);
        rectangle.setPerimeter();
        rectangle.surfaceArea();

        // 8. Crea una clase Worker que reciba nombre y salario, y un metodo para mostrar su salario.
        var worker = new Worker("Juana", 889.74f);
        worker.setSalary(889.75f);

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var person = new Person("Ana", 18);
        var enemy = new Person("Perico", 17);
        var lucy = new Person("Lucy", 28);

        var characters = new ArrayList<Person>();
        characters.add(person);
        characters.add(enemy);
        characters.add(lucy);

        // 10. Crea una clase Product y un metodo que aplique un descuento sobre su precio.
        var milk = new Product(6.4f);
        var coffee = new Product(15.87f);
        var tofu = new Product(1f);

        milk.applyDiscount(0f);
        coffee.applyDiscount(1.87f);
        tofu.applyDiscount(0.5f);
    }
}
