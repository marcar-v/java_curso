package p05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class DataStructures {
    static void main (String[] args){
        Maps();
    }

    static void Arrays(){
        //Arrays
        int [] numbersArray = new int [3];
        String [] namesArray = {"Violeta", "Martín", "Carrillo"};
        System.out.println(namesArray[0]);
        numbersArray[1] = 10;
        numbersArray[0] = 5;
        System.out.println(numbersArray[1]);
    }

    static void Lists(){
        //Declaración y creación
        ArrayList<String> namesList = new ArrayList<>(); //más antigua
        var numbers = new ArrayList<Integer>(); //más moderna

        Random randomNumber = new Random();
        int number = randomNumber.nextInt(2);
        number += 0;

        //Tamaño
        System.out.println(namesList.size());

        //Añadir elementos
        namesList.add("Violeta");
        namesList.add("Ana");
        namesList.add("Paula");

        //Acceder
        System.out.println(namesList.getFirst());
        System.out.println(namesList.get(1));
        System.out.println(namesList.getLast());
        System.out.println(namesList.get(number));

        //Modificar elementos
        namesList.set(2, "marcarv_");
        System.out.println(namesList.getLast());

        //Eliminar elementos
        namesList.remove(2);

    }

    static void Sets(){
        //Declaración y creación
        HashSet <String> namesSet = new HashSet<>();
        var numberSet = new HashSet<>();

        //Añadir elementos
        namesSet.add("Violeta");
        namesSet.add("Ana");
        namesSet.add("Paula");
        namesSet.add("Rebeca");

        //Eliminar elementos
        System.out.println(namesSet.size());
        namesSet.remove("Violeta");

        //Acceder
        System.out.println(namesSet.size());
        System.out.println(namesSet);

        System.out.println(namesSet.contains("Paula"));
        System.out.println(namesSet.contains("Violeta"));
    }

    static void Maps(){
        HashMap<String, String> namesMap = new HashMap<>();
        var numbersMap = new HashMap<Integer, String>();

        //Tamaño
        System.out.println(namesMap.size());

        //Añadir elementos
        namesMap.put("Paula", "paula@gmail.com");
        namesMap.put("Ana", "ana@gmail.com");
        namesMap.put("Sofía", "sofia@gmail.com");

        System.out.println(namesMap.size());
        System.out.println(namesMap);

        //Acceder a los elementos
        System.out.println(namesMap.get("Sofía"));

        //Verificar elementos
        System.out.println(namesMap.containsKey("Lucía"));
        System.out.println(namesMap.containsValue("ana@gmail.com"));

        //Eliminar elementos
        System.out.println(namesMap.remove("Sofía"));
        System.out.println(namesMap);

        // Limpieza

        namesMap.clear();
        System.out.println(namesMap);

        // Modificación

        namesMap.put("Ana", "ana@gmail.com");
        System.out.println(namesMap);

        namesMap.put("Paula", "paula@gmail.com");
        System.out.println(namesMap);

        namesMap.replace("Paula", "paula2@gmail.com"); // Reemplaza el valor si existe
        System.out.println(namesMap);

        namesMap.putIfAbsent("Lucía", "lucia@gmail.com"); // Solo lo añade si no existe
        System.out.println(namesMap);

        // Otras operaciones

        System.out.println(namesMap.isEmpty());
        var values = namesMap.values();
        System.out.println(values);
    }
}

