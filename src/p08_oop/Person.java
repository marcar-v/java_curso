package p08_oop;

public class Person {
    //Atributos
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    //Funciones o métodos
    public void sayHello(){
        System.out.println("Soy " + name + " y tengo " + age + " años.");
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Edad no válida");
        } else {
            this.age = age;
        }
    }

}
