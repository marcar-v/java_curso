package p06_loops;

import java.util.*;

public class LoopsExercises {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 0;
        int numbers = 1;
        while(index < 10){
            System.out.println(numbers++);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        var numbersList = new ArrayList<Integer>();
        numbersList.add(100);
        numbersList.add(200);
        numbersList.add(300);
        index = 0;
        do{
            System.out.println(numbersList.get(index));
            index++;
        } while(index < numbersList.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for(int i = 1; i <= 50; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int numbersToSum [] = {1, 2, 3, 4, 5, -1, 6};
        int sum = 0;
        for(int n : numbersToSum){
            sum += n;
        }
        System.out.println(sum);
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for(int n : numbersToSum){
            System.out.println(n);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var users = new HashMap<String, Integer>();
        users.put("Ana", 65896532);
        users.put("Paula", 63248513);
        users.put("Mercedes", 72258695);

        for(Map.Entry<String, Integer> user : users.entrySet()){
            System.out.println(" ");
            System.out.println(user.getKey());
            System.out.println(user.getValue());
        }

        var ages = new HashSet<Integer>();
        ages.add(10);
        ages.add(20);
        ages.add(30);

        for(Integer age : ages){
            System.out.println(age);
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
            numbers = 10;
        for(int i = 0; i < 10; i++){
            System.out.println(numbers);
            numbers--;
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for(int i = 0; i <= 20; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        for (Integer number : numbersToSum) {
            if (number < 0) {
                break;
            }
            System.out.println(number);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n = input.nextByte(); // número dado
        long factorial = 1;

        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial de " + n + " = " + factorial);

    }
}
