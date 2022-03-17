package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @ Test
    public void depositTest(){
        //given
        Account dejAccount = new Account();
        //when
        dejAccount.deposit(100);
        //assert
        assertEquals(100, dejAccount.getBalance());
    }

    @Test
    @DisplayName("Test to show balance after depositing twice")
    public void depositTwiceTest(){
        //given
        Account dejAccount = new Account();
        //when
        dejAccount.deposit(500);
        dejAccount.deposit(400);
        //assert
        assertEquals(900, dejAccount.getBalance());
    }

    @Test
    @DisplayName("Test that negative deposit will not work")
    public void negativeDepositTest(){
        //given
        Account dejAccount = new Account();
        //when
        dejAccount.deposit(1000);
        dejAccount.deposit(-500);
        //assert
        assertEquals(1000, dejAccount.getBalance());
    }

    @Test
    @DisplayName("Test for withdrawal")
    public void withdrawalTest(){
        //given
        Account dejAccount = new Account();
        //when
        dejAccount.deposit(1000);
        dejAccount.withdraw(500);
        //assert
        assertEquals(500, dejAccount.getBalance());
    }

    @Test
    @DisplayName("Test for no money in the account")
    public void withdrawWithoutMoneyTest(){
        //given
        Account dejAccount = new Account();
        //when
        dejAccount.withdraw(500);
        //assert
        assertEquals(0, dejAccount.getBalance());
    }

    @Test
    @DisplayName("Test to withdraw more than money in balance")
    public void excessWithdrawalTest(){
        //given
        Account dejAccount = new Account();
        //when
        dejAccount.deposit(100);
        dejAccount.withdraw(200);
        //assert
        assertEquals(100, dejAccount.getBalance());
    }

}

/*
fiveDigits = input.nextInt();

        int digitOne = fiveDigits % 10;
        int digitTwo = fiveDigits % 100;
        int digitThree = fiveDigits % 1000;
        int digitFour = fiveDigits % 10000;
        int digitFive = fiveDigits % 100000;

        int newDigitFive = digitFive / 1;
        int newDigitFour = digitFour / 10;
        int newDigitThree = digitThree / 100;
        int newDigitTwo = digitTwo / 1000;
        int newDigitOne = digitOne / 10000;

        fiveDigitsBackwards = newDigitOne * 10000 + newDigitTwo * 1000 + newDigitThree * 100 + newDigitFour * 10 + newDigitFive * 1;*/
