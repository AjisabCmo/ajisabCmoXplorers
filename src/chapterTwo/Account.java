package chapterTwo;

public class Account {

    private int balance;

    public void deposit(int amount) {
       if (amount > 0) {
           balance = balance + amount;
       }

    }

    public int checkBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        if ((balance >= amount) && (amount >= 0))
            balance = balance - amount;

        System.out.println("insufficient balance");
    }
}
