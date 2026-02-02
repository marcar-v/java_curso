package p04_conditionals;
import java.util.Scanner;

public class Conditional {
    static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("Puedes continuar.");
        }
        else {
            System.out.println("No puedes acceder.");
        }
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("No es lunes, martes o miércoles");
        }
    }
}
