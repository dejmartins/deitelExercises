package tddClass.ChapterEight;

import ChapterEight.ComplexNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexNumbersTest {
    @Test
    public void addComplexNumbersText(){
        ComplexNumbers complex1 = new ComplexNumbers(2, 2);
        ComplexNumbers complex2 = new ComplexNumbers(2, 2);
        complex1.plus(complex2);
        assertEquals("(4, 4i)", complex1.getValue());
    }

    @Test
    public void subtractComplexNumbers(){
        ComplexNumbers complex1 = new ComplexNumbers(5, 7);
        ComplexNumbers complex2 = new ComplexNumbers(2, 2);
        complex1.minus(complex2);
        assertEquals("(3, 5i)", complex1.getValue());
    }
}
