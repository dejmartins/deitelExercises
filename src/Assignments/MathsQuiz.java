package Assignments;

import java.util.Random;
import java.util.Scanner;

public class MathsQuiz {
    public static void main(String[] args) {
        Random number = new Random();
        Scanner input = new Scanner(System.in);

        String operator = "";
        int expression = 0;
        int correctAnswers = 0;
        int wrongAnswers = 0;
        int counter = 1;

        while (counter <= 10) {
            int firstNumber = number.nextInt(11);
            int secondNumber = number.nextInt(11);

            Random operatorSelection = new Random();
            switch (operatorSelection.nextInt(5)) {
                case 0:
                    operator = "+";
                    expression = firstNumber + secondNumber;
                    break;

                case 1:
                    operator = "-";
                    expression = firstNumber - secondNumber;
                    break;

                case 2:
                    operator = "/";
                    expression = firstNumber / secondNumber;
                    break;

                case 3:
                    operator = "*";
                    expression = firstNumber * secondNumber;
                    break;

                case 4:
                    operator = "%";
                    expression = firstNumber % secondNumber;
                    break;

            }

            System.out.printf("What is %d %s %d = ? ", firstNumber, operator, secondNumber);
            int result = input.nextInt();

            if (result == expression) {
                correctAnswers++;
            } else {
                wrongAnswers++;
            }

            counter++;
        }

        int overallResult = correctAnswers - wrongAnswers;
        System.out.println("You scored " + overallResult + " out of 10");
    }
}
