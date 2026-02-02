package p08_oop;

public class Classes {
    public static void main(String[] args){
        var person = new Person("Ana", 18);
        var enemy = new Person("Perico", 17);
        var lucy = new Person("Lucy", 28);
        person.sayHello();
        enemy.sayHello();
        lucy.sayHello();
    }
}