package ChapterEleven;

import java.util.InputMismatchException;

public class DivByZero {

    public int divide(int firstNumber, int secondNumber) {
        try{
            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
