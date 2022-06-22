package tddClass.ChapterEight;

import ChapterEight.SavingsAccount.InterestRateException;
import ChapterEight.SavingsAccount.SavingsAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {
    @Test
    public void calculateMonthlyInterestRateTest() throws InterestRateException {
        SavingsAccount mySavings = new SavingsAccount();
        mySavings.topSavings(1000);
        mySavings.calculateMonthlyInterest();
        assertEquals(1050, mySavings.getSavingsBalance());
    }
}
