package BankApp;

import java.util.ArrayList;

public class Bank {
    private  int totalNumberOfAccounts;
    private ArrayList<CmoAccount> accounts;


    public Bank(String bankName) {
        accounts = new ArrayList<>();

    }

    public CmoAccount createAccountFor(String firstName, String lastName, String pin) {
      totalNumberOfAccounts ++;
        String accountNumber = generateAccountNumber();
        String accountName = generateAccountNameFrom(firstName,lastName);
        CmoAccount cmoAccount = new CmoAccount(accountNumber,accountName,pin);
        accounts.add(cmoAccount);
        return cmoAccount;
    }

    private String generateAccountNameFrom(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private String generateAccountNumber() {
//        return (accounts.size() + 1)+ " ";
        return totalNumberOfAccounts + "";
    }

    public int getTotalNumberOfAccount() {

       return totalNumberOfAccounts;
//      return accounts.size();
    }

    public CmoAccount findAccountNumber(String number) {
        for (CmoAccount account : accounts){
            if (account.getAccountNumber().equals(number))return account;

        }
        throw new IllegalStateException("Account not found");
    }

    public void deposit(int amount, String accountNumber) {
        CmoAccount account = findAccountNumber(accountNumber);
        account.deposit(amount);
    }

    public int checkBalance(String number, String pin) {
        return findAccountNumber(number).checkBalance(pin);
    }

    public void Withdraw(int amount, String number, String pin) {
        CmoAccount account = findAccountNumber(number);
        account.withdraw(amount);

    }

    public void Transfer(int amount, String number, String number1, String pin) {
findAccountNumber(number).withdraw(amount);
findAccountNumber(number1).deposit(amount);

    }
}
