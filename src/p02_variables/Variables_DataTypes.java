package p02_variables;

public class Variables_DataTypes {
    public static void main (String[] args){
        //Variables
        String name = "Violeta";
        System.out.println(name);

        int age = 30;
        System.out.println(age);

        name = "_marcarv";
        System.out.println(name);

        final String EMAIL = "marcarv@blabla.com";
        System.out.println(EMAIL);

        //Tipos de datos primitivos
        int myInt = 10;
        System.out.println(myInt);

        double myDouble = 1.5;
        System.out.println(myDouble);

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBool = true;
        System.out.println(myBool);

        String myString = "Hola";
        System.out.println(myString);

        //Tipo de dato en tiempo de compilación
        System.out.println(myString.getClass().getSimpleName());
    }
}
