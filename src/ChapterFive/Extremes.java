package ChapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 numerical values");
        System.out.print("First digit: ");
        int firstNumber = input.nextInt();

        System.out.print("Second digit: ");
        int secondNumber = input.nextInt();

        System.out.print("Third digit: ");
        int thirdNumber = input.nextInt();

        System.out.print("Fourth digit: ");
        int fourthNumber = input.nextInt();

        System.out.println();

        int maximum = getMaximum(firstNumber, secondNumber, thirdNumber, fourthNumber);
        System.out.printf("The maximum value is %d%n", maximum);

        int minimum = getMinimum(firstNumber, secondNumber, thirdNumber, fourthNumber);
        System.out.printf("The minimum value is %d%n", minimum);

        int sum = sumOfMaxAndMin(firstNumber, secondNumber, thirdNumber, fourthNumber);
        System.out.printf("The sum is the extremes is %d%n", sum);
    }


    public static int getMaximum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int maximumNumber = firstNumber;
        if(secondNumber > maximumNumber) maximumNumber = secondNumber;
        if(thirdNumber > maximumNumber) maximumNumber = thirdNumber;
        if(fourthNumber > maximumNumber) maximumNumber = fourthNumber;
        return maximumNumber;
    }

    public static int getMinimum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int minimumNumber = firstNumber;
        if(secondNumber < minimumNumber) minimumNumber = secondNumber;
        if(thirdNumber < minimumNumber) minimumNumber = thirdNumber;
        if(fourthNumber < minimumNumber) minimumNumber = fourthNumber;
        return minimumNumber;
    }

    public static int sumOfMaxAndMin(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int minimum = getMinimum(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int maximum = getMaximum(firstNumber, secondNumber, thirdNumber, fourthNumber);
        return minimum + maximum;
    }
}
