package p04_conditionals;

import java.util.Scanner;

public class ConditionalsExercises {
    static void main(String[] args){
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("Puedes continuar.");
        }
        else {
            System.out.println("No puedes acceder.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 2;
        int num2 = 3;

        if (num1 == num2){
            System.out.println("Los números son iguales");
        }
        else if(num1 < num2){
            System.out.println("El primer número es menor que el segundo");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int number = inputInt.nextInt();
        if(number == 0){
            System.out.println("El número es cero");
        }
        else if( number < 0)
        {
            System.out.println("El número es negativo");
        }
        else {
            System.out.println("El número es mayor que cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        if(number % 2 == 0){
            System.out.println("Es un número par");
        }

        else {
            System.out.println("Es un número impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        if(number >= 1 && number <= 100)
        {
            System.out.println("El número está en rango");
        }
        else{
            System.out.println("El número no está en rango");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int marks = 50;
        switch(marks) {
            case 1:
                System.out.println("Sobresaliente");
                break;
            case 2:
                System.out.println("Aprobado");
                break;
            case 3:
                System.out.println("Suspenso");
                break;
            default:
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        if(age <= 15){

            System.out.println("¿Vas acompañado? (Si/No)");
            Scanner alone = new Scanner (System.in);
            String isAloneInput = alone.next();
            boolean isAlone = isAloneInput.equalsIgnoreCase("si");

            if (!isAlone){
                System.out.println("No puedes pasar.");
            }
            else {
                System.out.println("Puedes pasar.");
            }
        }
        else{
            System.out.println("Puedes pasar.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        System.out.println("Introduce una letra:");
        Scanner characterInput = new Scanner(System.in);
        char character = characterInput.next().toLowerCase().charAt(0);
        if(character == 'a'|| character == 'e'|| character == 'i'|| character == 'o'|| character == 'u'){
            System.out.println("Vocal");
        }
        else{
            System.out.println("Consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        var a = 1;
        var b = 2;
        var c = 10;
        int greatest = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + greatest);

    }
}
