package ChapterFour;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a four-digit integer");
        int integer = input.nextInt();

        int fourthNumber = (integer % 10);
        int thirdNumber = (integer % 100) / 10;
        int secondNumber = (integer % 1000) / 100;
        int firstNumber = (integer % 10000) / 1000;

        firstNumber += 7;
        secondNumber += 7;
        thirdNumber += 7;
        fourthNumber += 7;

        firstNumber %= 10;
        secondNumber %= 10;
        thirdNumber %= 10;
        fourthNumber %= 10;

        int nullNumber = firstNumber;
        firstNumber = fourthNumber;
        fourthNumber = nullNumber;
        nullNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = nullNumber;

        int result = firstNumber * 1000 + secondNumber * 100 + thirdNumber * 10 + fourthNumber * 1;

        System.out.printf("%d", result);

    }
}
