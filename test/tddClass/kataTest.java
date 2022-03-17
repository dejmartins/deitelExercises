package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
