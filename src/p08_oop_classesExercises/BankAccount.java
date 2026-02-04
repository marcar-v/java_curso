package p08_oop_classesExercises;

public class BankAccount {
    private float balance;

    public BankAccount(float balance){
        this.setBalance(balance);
    }

    public float getBalance(){
        return balance;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public void deposit(float income){
        balance = income + balance;
        System.out.println("Ahora mismo tienes en la cuenta: " + balance);
    }
    public void withdraw(float outcome){
        balance = balance - outcome;
        System.out.println("Ahora mismo tienes en la cuenta: " + balance);
    }
}
