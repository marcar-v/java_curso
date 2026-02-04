package p08_oop;

import p08_oop_classesExercises.BankAccount;
import p08_oop_classesExercises.Book;
import p08_oop_classesExercises.Product;
import p08_oop_classesExercises.Temperature;

public class AccessModifiersExercises {
    static void main() {
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var person = new Person("Ana", 18);
        var enemy = new Person("Perico", 17);
        var lucy = new Person("Lucy", 28);

        lucy.sayHello();
        enemy.sayHello();

        // 2. Crea una clase Product con el atributo privado price. Añade el metodo setPrice(double price) que solo permita precios mayores a 0.
        var milk = new Product(2.54f);
        var coffee = new Product(0f);

        coffee.applyDiscount(-1f);
        milk.applyDiscount(0.54f);

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var account = new BankAccount(100);
        account.deposit(50);
        account.withdraw(150);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el metodo getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var book = new Book("1984", "G. Orwell", 1949);
        book.showBookData();
        // 5. Crea una clase Temperature con el atributo privado celsius. El metodo setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperature = new Temperature();
        temperature.setCelsius(101);
        temperature.setCelsius(30);

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el metodo raiseSalary(double percent) que solo permita aumentos positivos.

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el metodo calculateArea() que devuelva el resultado de width * height.

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
    }
}
