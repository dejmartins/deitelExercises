package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class kataTest {

    @Test
    @DisplayName("Test for a palindrom")
    public void palindromeTest() {
        Kata palindrome = new Kata();
        //when
        boolean result = palindrome.isPalindrome(12345);
        //assert
        assertEquals(false, result);
    }

    @Test
    public void cbtAppTest(){
        //given
        Kata cbtApp = new Kata();
        //when
        int result = cbtApp.numberOfCopies(5);
        //assert
        assertEquals(9000, result);
    }

    @Test
    public void quotientTest(){
        Kata quotientCalculator = new Kata();
        int result = quotientCalculator.quotient(10,2);
        assertEquals(5, result);
    }


    @Test
    public void evenNumberTest(){
        int number = 0;
        while(number < 10){
            number += 2;
            System.out.print(number + " ");
        }
    }

    @Test
    public void evenOddCheckTest(){
        Kata number = new Kata();
        boolean result = number.isEven(1006756772);
        assertTrue(result);
    }

    @Test
    public void highestNumber(){
        Kata digit = new Kata();
        int result = digit.highest(23, 1000, 88, 4, 9);
        assertEquals(1000, result);
    }

    @Test
    public void factorsOfANumberTest(){
        Kata kata = new Kata();
        int result = kata.factorsOf(49);
        assertEquals(3, result);
    }

    @Test
    public void primeNumberTest(){
        Kata kata = new Kata();
        boolean result = kata.primeNumberOf(10);
        assertFalse(result);
    }

    /*@Test
    public void sumEvenNumbersTest(){
        Kata kata = new Kata();
        int result = kata.sumOfE
    }*/
}
