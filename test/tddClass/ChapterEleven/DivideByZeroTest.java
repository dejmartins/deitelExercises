package tddClass.ChapterEleven;

import ChapterEleven.DivByZero;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideByZeroTest {
    @Test
    public void testToDivide(){
        DivByZero div = new DivByZero();
        double result = div.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testToThrowExceptionWhenDivisorIsZero(){
        DivByZero div = new DivByZero();
        assertThrows(ArithmeticException.class,() -> div.divide(5, 0));
    }
}
