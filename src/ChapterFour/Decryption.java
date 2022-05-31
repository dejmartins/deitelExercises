package ChapterFour;

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four-digit encrypted integer");
        int integer = input.nextInt();

        int firstNumber = (integer % 10000) / 1000;
        int secondNumber = (integer % 1000) / 100;
        int thirdNumber = (integer % 100) / 10;
        int fourthNumber = (integer % 10);
        int nullNumber;

        nullNumber = firstNumber;
        firstNumber = fourthNumber;
        fourthNumber = nullNumber;
        nullNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = nullNumber;

        //Add a 10 to avoid getting a negative.
        //Getting the modulo using a negative will result to zero and one only
        firstNumber += 10 - 7;
        secondNumber += 10 - 7;
        thirdNumber += 10 - 7;
        fourthNumber += 10 - 7;

        firstNumber = firstNumber % 10;
        secondNumber = secondNumber % 10;
        thirdNumber = thirdNumber % 10;
        fourthNumber = fourthNumber % 10;


        int result = firstNumber * 1000 + secondNumber * 100 + thirdNumber * 10 + fourthNumber;

        System.out.println(result);




    }
}
