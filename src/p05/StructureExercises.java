package p05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructureExercises {
    static void main (String[] args){
        // 1. Crea un Array con 5 valores e imprime su longitud.
        int [] numbers = {1, 2, 3, 4, 5};
        IO.println(numbers.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        IO.println(numbers[1]);
        numbers[1] = 0;
        IO.println(numbers[1]);

        // 3. Crea un ArrayList vacío.
        var numbersList = new ArrayList<Integer>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(3);
        IO.println(numbersList);
        numbersList.remove(3);
        IO.println(numbersList);

        // 5. Crea un HashSet con 2 valores diferentes.
        var namesSet = new HashSet<String>();
        namesSet.add("Claudia");
        namesSet.add("María");

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        namesSet.add("María");
        namesSet.add("Juan");
        IO.println(namesSet);

        // 7. Elimina uno de los elementos del HashSet.
        namesSet.remove("María");
        IO.println(namesSet);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var contacts = new HashMap<String, Integer>();
        contacts.put("Claudia", 65263865);
        contacts.put("Juan", 54296885);
        contacts.put("Rocío", 654869635);

        // 9. Modifica uno de los contactos y elimina otro.
        contacts.replace("Juan", 123456789);
        contacts.remove("Rocío");
        IO.println(contacts);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] names = {"Ana", "Belén", "Celia"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        IO.println(nameList);

        HashSet<String> nameSet = new HashSet<>(nameList);
        IO.println(nameSet);

        int i = 1;
        HashMap<String, Integer> orderNames = new HashMap<>();
        for(String name : nameSet){
            orderNames.put(name, i);
            i++;
        }
        IO.println(orderNames);

    }
}
