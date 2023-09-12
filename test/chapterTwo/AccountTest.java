package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void depositTest() {

        //given i hava an account

        Account ismailAccount = new Account();

        //when i deposit 5k

        ismailAccount.deposit(5000);

        //check     my balance is 5k
        int balance = ismailAccount.checkBalance();
        assertEquals(5000, balance);

    }

        @Test
         public void testDepositMultiple() {
            Account ismailAccount = new Account();
            ismailAccount.deposit(2000);
           // int balance = ismailAccount.checkBalance();
            assertEquals(2000, ismailAccount.checkBalance());
            ismailAccount.deposit(5000);
           // int balance1 = ismailAccount.checkBalance();
            assertEquals(7000, ismailAccount.checkBalance());
        }

        @Test
         public void withdrawTest() {
            Account ismailAccount = new Account();
            ismailAccount.deposit(2000);
            //int balance = ismailAccount.checkBalance();
            //assertEquals(2000, balance);

            ismailAccount.withdrawal(1000);
           // int newBalance = ismailAccount.checkBalance();
            assertEquals(1000, ismailAccount.checkBalance());

        }

        @Test
          public void withdrawTest1(){
             Account ismailAccount = new Account();
             ismailAccount.deposit(1000);
             int balance = ismailAccount.checkBalance();
             assertEquals(1000, balance);

             ismailAccount.withdrawal(1000);
             int newBalance = ismailAccount.checkBalance();
             assertEquals(0,newBalance);


    }
        @Test
          public void withdrawalNegativeValueTest(){
        //given
        Account ismailAccount= new Account();
        //initial
            ismailAccount.deposit(5000);
            //when
            ismailAccount.withdrawal(-3000);
            //check
            assertEquals(5000, ismailAccount.checkBalance());



        }

        @Test
         public void theftWithdrawFailTest(){
        //given
            Account ismailAccount = new Account();

            //when
            ismailAccount.deposit(3000);
            ismailAccount.withdrawal(5000);

            //check
            assertEquals(3000, ismailAccount.checkBalance());
        }

        @Test
        public void negativeWithdrawalTwiceTest(){
        //given
            Account ismailAccount = new Account();

            //when
            ismailAccount.deposit(4000);
            ismailAccount.deposit(4000);
            ismailAccount.deposit(-4000);

            //check
            assertEquals(8000, ismailAccount.checkBalance());

        }

}











