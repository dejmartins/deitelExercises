package ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivByZeroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DivByZero div = new DivByZero();

        try{
            System.out.print("Input divisor: ");
            int divisor = sc.nextInt();

            System.out.print("Input dividend: ");
            int dividend = sc.nextInt();

            int result = div.divide(divisor, dividend);

            System.out.printf("This results to %d", result);
        }catch (InputMismatchException err){
            System.err.print("Oops! Input an integer!");
        }catch (ArithmeticException err){
            System.err.print("Oops! Input integer greater than zero");
        }

    }
}
