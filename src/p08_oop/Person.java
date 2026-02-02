package p08_oop;

public class Person {
    //Atributos
    String name;
    int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Funciones o métodos
    public void sayHello(){
        System.out.println("Soy " + name + " y tengo " + age + " años.");

    }

}
