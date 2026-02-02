package p03_strings;

public class StringsExercises {
    static void main (String[] args){
        // 1. Concatena dos cadenas de texto.
            String name = "Violeta";
            String surname = "Martín";
            System.out.println(name + " " + surname);
        // 2. Muestra la longitud de una cadena de texto.
            System.out.println(name.length());
        // 3. Muestra el primer y último carácter de un string.
            System.out.println(name.charAt(0) + " " + name.charAt(name.length() - 1));
        // 4. Convierte a mayúsculas y minúsculas un string.
            System.out.println(name.toUpperCase());
            System.out.println(name.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
            System.out.println(name.contains("leta"));
            System.out.println(name.contains("uto"));
        // 6. Formatea un string con un entero.
            int age = 30;
            System.out.println(name.format("Hola, soy %s y tengo %d años", name, age));
        // 7. Elimina los espacios en blanco al principio y final de un string.
            System.out.println(" Hola, soy Violeta y tengo 30 años ".trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
            System.out.println("Hola, soy Violeta y tengo 30 años".replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
            System.out.println(name.equals(surname));
        // 10. Comprueba si dos strings tienen la misma longitud.
            System.out.println(name.length() == surname.length());
    }
}
