package ChapterFour;

import java.util.Scanner;

public class PalindromeExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5 digit number: ");
        int number = input.nextInt();

        while (number > 99999) {
            System.out.println("Error! enter a new number");
            System.out.print("Enter a 5 digit number: ");
            number = input.nextInt();
        }

        int firstNumber = (number % 10) / 1;
        int secondNumber = (number % 100) / 10;
        int thirdNumber = (number % 1000) / 100;
        int fourthNumber = (number % 10000) / 1000;
        int fifthNumber = (number % 100000) / 10000;

        if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("Not a palindrom");
        }
    }
}
