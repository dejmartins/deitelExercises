package tddClass.ChapterEight;

import ChapterEight.RationalNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RationalNumbersTest {


    @Test
    public void valueStoresInAReduceFormTest(){
        RationalNumber number = new RationalNumber(6, 10);
        assertEquals("3/5", number.getValueIn("fraction"));
    }

    @Test
    public void addRationalNumbersTest(){
        RationalNumber number = new RationalNumber(1, 5);
        assertEquals("2/5", RationalNumber.plus(1, 5));
    }

    @Test
    public void subtractRationalNumbersTest(){
        RationalNumber number = new RationalNumber(4, 5);
        assertEquals("3/5", RationalNumber.minus(1, 5));
    }

    @Test
    public void multiplyRationalNumbersTest(){
        RationalNumber number = new RationalNumber(4, 5);
        assertEquals("8/15", RationalNumber.times(2, 3));
    }

    @Test
    public void divideRationalNumbersTest(){
        RationalNumber number = new RationalNumber(4, 5);
        assertEquals("6/5", RationalNumber.divides(2, 3));
    }

    @Test
    public void valueCanBeRetrievedInFloatingFormat(){
        RationalNumber number = new RationalNumber(6, 10);
        assertEquals("0.6", number.getValueIn("float"));
    }
}
