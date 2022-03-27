package ChapterFour;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int factorialValues = 1;
        int count = 0;
        int result = 1;

        System.out.print("Enter a number: ");
        int integer = input.nextInt();

        while(factorialValues > 0){
            factorialValues = integer - count;

            if(factorialValues == 0) break;

            result *= factorialValues;
            count++;
        }
        System.out.println(result);
    }
}
