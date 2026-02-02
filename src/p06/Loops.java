package p06;

import java.util.HashMap;
import java.util.Map;

public class Loops {
    static void main(String[] args){
        // Bucle for
        for(int i = 1; i <= 5; i++){
            IO.println("Hola, " + i);
        }

        //Bucle for-each
        String [] names = {"Carmen", "Juan", "Pedro", "Paco", "Pepe"};
        for (String name : names) {
            IO.println(name);
        }

        var users = new HashMap<String, Integer>();
        users.put("Ana", 65896532);
        users.put("Paula", 63248513);
        users.put("Mercedes", 72258695);

        for(Map.Entry<String, Integer> user : users.entrySet()){
            IO.println(" ");
            IO.println(user.getKey());
            IO.println(user.getValue());
        }

        //Bucle while
        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java!");
            index++;
        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Pedro")) {
                IO.println(" ");

                find = true;
            }
            index++;
        }

        //Bucle do - while
        index = 0;
        do{
            System.out.println("Hola, Java!");
            index++;
        } while(index < 5);

        //Control de bucles
        // break
        index = 0;
        for (String name : names) {
            if (name.equals("Paco")) {
                break;
            }
            IO.println(name);
        }

        // continue
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            IO.println("Hola, " + i);
        }
    }

}
