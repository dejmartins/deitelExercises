package ChapterEleven;

public class DivByZero {

    public int divide(int firstNumber, int secondNumber) throws ArithmeticException {
        try{
            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
