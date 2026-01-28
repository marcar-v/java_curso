package p05;

import java.util.ArrayList;
import java.util.Random;

public class DataStructures {
    static void main (String[] args){
        Lists();
    }

    static void Arrays(){
        //Arrays
        int [] numbers = new int [3];
        String [] names = {"Violeta", "Martín", "Carrillo"};
        System.out.println(names[0]);
        numbers[1] = 10;
        numbers[0] = 5;
        System.out.println(numbers[1]);
    }

    static void Lists(){
        //Declaración y creación
        ArrayList<String> names = new ArrayList<>(); //más antigua
        var numbers = new ArrayList<Integer>(); //más moderna

        Random randomNumber = new Random();
        int number = randomNumber.nextInt(2);
        number += 0;

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos
        names.add("Violeta");
        names.add("Ana");
        names.add("Paula");

        //Acceder
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());
        System.out.println(names.get(number));

        //Modificar elementos
        names.set(2, "marcarv_");
        System.out.println(names.getLast());

        //Eliminar elementos
        names.remove(2);

    }
}

