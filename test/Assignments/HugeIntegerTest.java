package Assignments;

import Assignments.HugeInteger.HugeInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    @Test
    public void testThatHugeIntegerClassExists(){
        HugeInteger integer = new HugeInteger();
        assertNotNull(integer);
    }

    @Test
    public void testHugeIntegerCanBeParsed(){
        HugeInteger integer = new HugeInteger();
        integer.parse("9876354678234589093746572122432516789283");
        String myInteger = integer.toString();
        assertEquals("9876354678234589093746572122432516789283", myInteger);
    }

    @Test
    public void testAdditionOfHugeNumbers(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111111111111111111111111111111111111111");
        myInteger.plus(yourInteger.toString());
        assertEquals("2222222222222222222222222222222222222222", myInteger.toString());
    }

    @Test
    public void testThatEachArrayElementIsOneCharacter(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111155");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111111111111111111111111111111111111155");
        myInteger.plus(yourInteger.toString());
        assertEquals("2222222222222222222222222222222222222310", myInteger.toString());
    }

    @Test
    public void testThatAnExceptionIsThrownWhenIntegerLengthExceedsForty(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111155");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("9111111111111111111111111111111111111155");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> myInteger.plus(yourInteger.toString()));
    }

    @Test
    public void testSubtractionOfHugeIntegers(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111111111111111111111111111111111111111");
        myInteger.minus(yourInteger.toString());
        assertEquals("0000000000000000000000000000000000000000", myInteger.toString());
    }

    @Test
    public void testToThrowExceptionWhenIntegersLessThanFortyDigitsIsParsed(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        assertThrows(StringIndexOutOfBoundsException.class, () -> yourInteger.parse("111111111111111111111111111111111111"));
    }

    @Test
    public void testToCompareIfTwoIntegersAreEqual(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111111111111111111111111111111111111111");
        boolean isEqual = myInteger.isEqualTo(yourInteger.getValue());
        assertTrue(isEqual);
    }

    @Test
    public void testToCompareIfTwoIntegersAreNotEquals(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111104532567881111111111111111111111111");
        boolean isNotEqual = myInteger.isNotEqualTo(yourInteger.getValue());
        assertTrue(isNotEqual);
    }

    @Test
    public void testToCompareTheGreaterHugeIntegerObject(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111104532567881111111111111111111111111");
        boolean isGreater = myInteger.isGreaterThan(yourInteger.getValue());
        assertTrue(isGreater);
    }

    @Test
    public void testToCompareTheLesserHugeIntegerObject(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111104532567881111111111111111111111111");
        boolean isLesser = yourInteger.isLessThan(myInteger.getValue());
        assertTrue(isLesser);
    }

    @Test
    public void testToCompareHugeIntegerLessThanOrEquals(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111104532567881111111111111111111111111");
        HugeInteger ourInteger = new HugeInteger();
        ourInteger.parse("1111111111111111111111111111111111111111");
        boolean isLessOrEquals = yourInteger.isLessThanOrEqualTo(myInteger.getValue());
        boolean isLessOrEqualsAsWell = yourInteger.isLessThanOrEqualTo(myInteger.getValue());
        assertTrue(isLessOrEquals);
        assertTrue(isLessOrEqualsAsWell);
    }

    @Test
    public void testToCompareHugeIntegerGreaterThanOrEquals(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("1111111111111111111111111111111111111111");
        HugeInteger yourInteger = new HugeInteger();
        yourInteger.parse("1111104532567881111111111111111111111111");
        HugeInteger ourInteger = new HugeInteger();
        ourInteger.parse("1111111111111111111111111111111111111111");
        boolean isGreaterOrEquals = yourInteger.isGreaterThanOrEqualTo(myInteger.getValue());
        boolean isGreaterOrEqualsAsWell = yourInteger.isGreaterThanOrEqualTo(myInteger.getValue());
        assertTrue(isGreaterOrEquals);
        assertTrue(isGreaterOrEqualsAsWell);
    }

    @Test
    public void testToCheckIfValueIsZero(){
        HugeInteger myInteger = new HugeInteger();
        myInteger.parse("0000000000000000000000000000000000000000");
        assertTrue(myInteger.isZero());
    }
}
