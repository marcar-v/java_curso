package p07;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    static void main (String[] args){
        sendEmail();
        sendEmailToUser("marcarv@gmail.com");
        sendEmailToUser("marcarv@gmail.com", "Violeta");

        var users = new ArrayList<>(Arrays.asList("marcarv@gmail.com", "canteracantera@gmail.com","paula154@gmail.com"));
        sendEmailToUser(users);

        var state = checkEmail("");

    }

    //Función sin parámetros ni retorno
    public static void sendEmail(){
        System.out.println("Email enviado.");
    }

    //Función con parámetros
    public static void sendEmailToUser(String userEmail){
        System.out.println("Email enviado a: "+ userEmail);
    }

    //Sobrecarga de funciones
    public static void sendEmailToUser(String userEmail, String username){
        System.out.println("Email enviado a: "+ username + " (" + userEmail +").");
    }

    public static void sendEmailToUser(ArrayList<String> emails){
        for(String email : emails){
            sendEmailToUser(email);
        }

    }

    //Función con retorno

    public static boolean checkEmail(String email){
        if(email.isEmpty()){
            System.out.println("Email no enviado.");
            return false;
        }
        System.out.println("Email enviado correctamente");
        return true;
    }
}
