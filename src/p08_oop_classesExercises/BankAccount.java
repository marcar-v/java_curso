package p08_oop_classesExercises;

public class BankAccount {
    float balance;

    public BankAccount(float balance){
        this.balance = balance;
    }

    public void deposit(float income){
        float total;
        total = income + balance;
        System.out.println("Ahora mismo tienes en la cuenta: " + total);
    }
}
