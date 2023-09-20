package chapterTwo;

public class Account1 {

    private int balance;

    public void deposit(int amount) {
        if (amount > balance) {
            this.balance = balance + amount;
        }
    }
        public void withdraw(int amount) {
            if (amount > balance) {
                System.out.println("insufficient funds");
            }else if (amount<0) {
                System.out.println("cant");
            }else

                this.balance = balance - amount;
            }




    public int checkBalance(){
        return balance;

    }
}
