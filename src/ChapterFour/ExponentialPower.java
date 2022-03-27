package ChapterFour;

import java.util.Scanner;

public class ExponentialPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int factorialValues = 1;
        int count = 0;
        int result = 1;
        int integer = 1;
        double numerator = 2;
        double factorialDivision = 0;
        double exponential = 1;

        System.out.print("Enter the number of terms to calculate: ");
        int numberOfTerms = input.nextInt();

        for(int counter = 1; counter <= numberOfTerms; counter++) {
            while (integer <= counter) {
                factorialValues = integer - count;

                result *= factorialValues;
                integer++;
            }

            factorialDivision = Math.pow(numerator, counter) / result;
            exponential += factorialDivision;
        }

        System.out.printf("The mathematical constant is %.3f", exponential);



    }
}
