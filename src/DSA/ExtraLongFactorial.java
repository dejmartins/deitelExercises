package DSA;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(factorial(number));
    }

    private static BigInteger factorial(int number){
        BigInteger bigInteger = new BigInteger(String.valueOf(number));
        if (bigInteger.intValue() == 1){
            return bigInteger;
        } else {
            return bigInteger.multiply(factorial(number - 1));
        }
    }
}
