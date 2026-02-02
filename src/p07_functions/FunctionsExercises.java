package p07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {
    public static void main(String[] args) {
        welcome();
        greeting("Josu");
        substraction(2, 2);
        square(2);
        pairOrEven(3);
        ageCheck(15);

        stringLenght("Violeta");

        int [] dataNumbers = {6, 6, 6};
        double numbersArithmetic = arithmeticMean(dataNumbers);
        System.out.println("La media es: " + numbersArithmetic);

        factorialNumber(5);

        var users = new ArrayList<>(Arrays.asList("marcarv@gmail.com", "canteracantera@gmail.com","paula154@gmail.com"));
        sendEmailToUser(users);
    }
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        public static void welcome(){
            System.out.println("¡Te doy la bienvenida al curso de Java!");
        }

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        public static void greeting(String name){
        System.out.println("Bienvenido al curso, " + name);
        }

        //3. Haz un metodo que reciba dos números enteros y devuelva su resta.
        public static void substraction(Integer n1, Integer n2){
        int substract = n1 - n2;
        System.out.println(substract);
        }

        // 4. Crea un metodo que calcule el cuadrado de un número (n * n).
        public static void square(Integer n1){
        int square = n1 * n1;
        System.out.println(square);
        }

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        public static void pairOrEven(Integer n1){
        if(n1 % 2 == 0){
            System.out.println("El número es par.");
        }
        System.out.println("El número es impar");
        }

        // 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        public static boolean ageCheck(Integer age){
        if (age >= 18){
            System.out.println("El usuario es mayor de edad");
            return true;
        }
        System.out.println("El usuario no es mayor de edad");
        return false;
        }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        public static int stringLenght(String text) {
            if (text == null) {
                return 0; // o lanzar excepción según necesidad
            }
            System.out.println(text.length());
            return text.length();
        }

        //  8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna.
        public static double arithmeticMean(int[] numbers) {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
                return (double) sum / numbers.length;
        }

        // 9. Escribe un metodo que reciba un número y retorna su factorial.
        public static int factorialNumber(int n1){
            int factorial = 1;
            for (int i = 2; i <= n1; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + n1 + " es: " + factorial);
            return factorial;
        }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        public static void sendEmailToUser(ArrayList<String> emails){
            for(String email : emails){
                System.out.println(email);
            }
        }
}
