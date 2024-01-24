package BankApp;

import com.sun.source.tree.UsesTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private Bank gtbank;


    @BeforeEach
    public void setUp() {
        gtbank = new Bank("Gtbank");

    }


    @Test
    public void testThatAccountCanBeCreatedForOneCustomer() {
        CmoAccount newAccount = gtbank.createAccountFor("ismail", "ajiboye", "pin");
        assertEquals(1, gtbank.getTotalNumberOfAccount());
        assertEquals("1", newAccount.getAccountNumber());
    }

    @Test
    public void testThatAccountCanBeCreatedForTwoCustomer() {
        CmoAccount firstAccount = gtbank.createAccountFor("ismail", "ajiboye", "pin");
        CmoAccount secondAccount = gtbank.createAccountFor("Abdullahi", "ajiboye", "pin");
        assertEquals(2, gtbank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        assertEquals("2", secondAccount.getAccountNumber());

    }

    @Test
    public void testThatBankCanFindAccountNumberForOneCustomer() {
        CmoAccount firstAccount = gtbank.createAccountFor("ismail", "ajiboye", "pin");
        assertEquals(1, gtbank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        CmoAccount account = gtbank.findAccountNumber("1");
        assertEquals(1, gtbank.getTotalNumberOfAccount());
        assertEquals("1", account.getAccountNumber());


    }

    @Test
    public void testThatBankCanFindAccountNumberForTwoCustomer() {
        CmoAccount firstAccount = gtbank.createAccountFor("ismail", "ajiboye", "pin");
        CmoAccount secondAccount = gtbank.createAccountFor("Abdullahi", "ajiboye", "pin");
        assertEquals(2, gtbank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        assertEquals("2", secondAccount.getAccountNumber());
        CmoAccount account = gtbank.findAccountNumber("1");
        CmoAccount account1 = gtbank.findAccountNumber("2");
        assertEquals(2, gtbank.getTotalNumberOfAccount());
        assertEquals("1", account.getAccountNumber());
        assertEquals("2", account1.getAccountNumber());


    }

    @Test
    public void testThatBankCanFindAccountNumberForThreeCustomer() {
        CmoAccount firstAccount = gtbank.createAccountFor("ismail", "ajiboye", "pin");
        CmoAccount secondAccount = gtbank.createAccountFor("Abdullahi", "ajiboye", "pin");
        CmoAccount thirdAccount = gtbank.createAccountFor("tomiwa", "ajiboye", "pin");
        assertEquals(3, gtbank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        assertEquals("2", secondAccount.getAccountNumber());
        assertEquals("3", thirdAccount.getAccountNumber());
        CmoAccount account = gtbank.findAccountNumber("1");
        CmoAccount account1 = gtbank.findAccountNumber("2");
        CmoAccount account2 = gtbank.findAccountNumber("3");
        assertEquals(3, gtbank.getTotalNumberOfAccount());
        assertEquals("1", account.getAccountNumber());
        assertEquals("2", account1.getAccountNumber());
        assertEquals("3", account2.getAccountNumber());


    }

    @Test
    public void testThatBankCanDepositToAccount() {
        CmoAccount firstAccount = gtbank.createAccountFor("ismail", "ajiboye", "pin");
        assertEquals(1, gtbank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        CmoAccount account = gtbank.findAccountNumber("1");
        assertEquals(1, gtbank.getTotalNumberOfAccount());
        assertEquals("1", account.getAccountNumber());
        gtbank.deposit(3_000, "1");
        assertEquals(3_000, gtbank.checkBalance("1", "pin"));
    }
       @Test
    public void testThatBankCanDepositToAnotherAccount() {
        CmoAccount firstAccount = gtbank.createAccountFor("ismail", "ajiboye", "pin");
           CmoAccount secondAccount = gtbank.createAccountFor("Abdullahi", "ajiboye", "pin");
           assertEquals(2, gtbank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
           assertEquals("2", secondAccount.getAccountNumber());

           CmoAccount account = gtbank.findAccountNumber("1");
           CmoAccount account1 = gtbank.findAccountNumber("2");

           assertEquals(2, gtbank.getTotalNumberOfAccount());
        assertEquals("1", account.getAccountNumber());
           assertEquals("2", account1.getAccountNumber());

           gtbank.deposit(3_000, "1");
           gtbank.deposit(2_000, "2");


           assertEquals(3_000, gtbank.checkBalance("1", "pin"));
           assertEquals(2_000, gtbank.checkBalance("2", "pin"));

       }
       @Test
    public void testThatBankCanWithdrawFromAccount(){
           CmoAccount firstAccount = gtbank.createAccountFor("ismail", "ajiboye", "pin");
           assertEquals(1, gtbank.getTotalNumberOfAccount());
           assertEquals("1", firstAccount.getAccountNumber());
           CmoAccount account = gtbank.findAccountNumber("1");
           assertEquals(1, gtbank.getTotalNumberOfAccount());
           assertEquals("1", account.getAccountNumber());
           gtbank.deposit(3_000, "1");
           assertEquals(3000,gtbank.checkBalance("1","pin"));
           gtbank.Withdraw(2000,"1","pin");
           assertEquals(1000,gtbank.checkBalance("1","pin"));
           assertThrows(InvalidPinException.class,()-> gtbank.checkBalance("1","wrongPin"));
           



       }
       @Test
    public void testThatBankCanTransferFromOneAccountToOtherBank(){
CmoAccount firstAccount = gtbank.createAccountFor("ismail","Ajiboye","pin");
assertEquals(1,gtbank.getTotalNumberOfAccount());
assertEquals("1",firstAccount.getAccountNumber());
CmoAccount secondAccount = gtbank.createAccountFor("Abdullahi","Ajiboye","pin");
assertEquals(2,gtbank.getTotalNumberOfAccount());
assertEquals("2",secondAccount.getAccountNumber());
assertEquals(0,gtbank.checkBalance("1","pin"));
assertEquals(0,gtbank.checkBalance("2","pin"));
//gtbank.deposit(5000,"1");
gtbank.deposit(20000,"1");
assertEquals(20000,gtbank.checkBalance("1","pin"));
gtbank.Transfer(10000,"1","2","pin");
assertEquals(10000,gtbank.checkBalance("1","pin"));
gtbank.Transfer(5000,"2","1","pin");
assertEquals(15000,gtbank.checkBalance("1","pin"));
assertEquals(5000,gtbank.checkBalance("2","pin"));
       }
}