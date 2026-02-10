package p08_oop_classesExercises;

import java.util.Scanner;

public class User {
    String username;
    String password;

    public User(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void checkPassword(){

        System.out.println("Introduce la contraseña:");
        Scanner input = new Scanner(System.in);
        String inputPassword = input.next();

        if(inputPassword.equals(password)){
            System.out.println("Contraseña correcta");
            return;
        }
        else{
            System.out.println("Contraseña incorrecta");
            return;
        }
    }
}
