package tddClass;

import Assignments.CardVerification.CardVerification;
import org.junit.jupiter.api.Test;

import static Assignments.CardVerification.Card.AMERICAN_EXPRESS;
import static Assignments.CardVerification.Card.VISA;
import static org.junit.jupiter.api.Assertions.*;

public class CardVerificationTest {
    @Test
    public void testToDoubleEverySecondDigit(){
        CardVerification verify = new CardVerification();
        int result = verify.sumOfDoubleEvenPlace("11111");
        assertEquals(4, result);
    }

    @Test
    public void testIfDoublingResultsTwoDigits_AddUp(){
        CardVerification verify = new CardVerification();
        int result = verify.sumOfDoubleEvenPlace("4388576018402626");
        assertEquals(37, result);
    }

    @Test
    public void testToSumValuesInOddPlaces(){
        CardVerification verify = new CardVerification();
        int result = verify.sumOfOddPlace("4388576018402626");
        assertEquals(38, result);
    }

    @Test
    public void testSumOf_AddedEvenPlacedValues_And_AddedOddPlacedValues(){
        CardVerification verify = new CardVerification();
        int result = verify.getSum("4388576018402626");
        assertEquals(75, result);
    }

    @Test
    public void testIfCardIsValid(){
        CardVerification verify = new CardVerification();
        verify.myCardType(VISA);
        boolean isValid = verify.isValid("4388576018410707");
        assertTrue(isValid);
    }

    @Test
    public void testPrefixMatchedForEachCardType(){
        CardVerification verify = new CardVerification();
        verify.myCardType(AMERICAN_EXPRESS);
        boolean isValid = verify.prefixMatched("3788576018402626", 37);
        assertTrue(isValid);
    }
}
