package BankApp;

import java.util.ArrayList;

public class CmoAccount {
    private int balance;

    private  String accountNumber;
    private  String accountName;
    private String pin;

    public CmoAccount(String accountNumber, String accountName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }else{
            throw  new InvalidAmountException("Amount is less than zero");
        }
    }

    public int checkBalance(String pin) {
        validatePin(pin);

        return balance;
    }

    private void validatePin(String pin) {
        if(!this.pin.equals(pin)){
            throw new InvalidPinException("wrongPin");

        }
    }

    public void withdraw(int amount) {
        if(amount>0){
            if (balance>amount){
                balance-=amount;
            }else{
                throw new InsufficientFundsException("InsufficientFunds");
            }
        }else {
            throw new InvalidAmountException("Amount is greater than zero");
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }
}