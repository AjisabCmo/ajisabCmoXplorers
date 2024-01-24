import BankApp.CmoAccount;
import BankApp.InvalidAmountException;
import BankApp.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class  CmoAccountTest {
    private CmoAccount account;

    @BeforeEach
    public void setUp() {
        account = new CmoAccount("1234", "Account name", "0101");

    }


    @Test
    public void testThatCmoCanDepositOneThousandAndBalanceIsOneThousand() {
        account.deposit(1000);
        assertEquals(1_000, account.checkBalance("0101"));
        account.deposit(3000);
        assertEquals(4_000, account.checkBalance("0101"));
    }

    @Test
    public void testThatCmoCanDepositOneThousandAndDepositThreeThousand() {
        account.deposit(1_000);
        account.deposit(3_000);
        assertEquals(4_000, account.checkBalance("0101"));
    }

    @Test
    public void wrongPinInCheckBalance_throwsExceptionTest() {
        assertThrows(InvalidPinException.class, () -> account.checkBalance("wrongPin"));
    }

    @Test
    public void correctPin_returnsBalanceTest() {
        account.deposit(1_000);
        account.deposit(2_000);
        assertEquals(3_000, account.checkBalance("0101"));
    }

    @Test

    public void testThatYouCanDoWithdrawal() {
        account.deposit(1_000);
        account.deposit(2_000);
        assertEquals(3_000, account.checkBalance("0101"));
        account.withdraw(2000);
        assertEquals(1_000, account.checkBalance("0101"));

    }

    @Test
    public void depositNegativeAmount_throwExceptionTest() {
        assertThrows(InvalidAmountException.class, () -> account.deposit(-10));
    }

    @Test
    public void depositTwoThousand_withdrawFiveHundred_balanceIsFiveHundredTest() {
        account.deposit(2_000);
        account.withdraw(500);
        assertEquals(1_500, account.checkBalance("0101"));
    }
    @Test
    public void depositSixThousand_withdrawThreeThousand_balanceThreeThousandTest(){
        account.deposit(6_000);
        account.withdraw(3_000);
        assertEquals(3_000, account.checkBalance("0101"));
    }

}



