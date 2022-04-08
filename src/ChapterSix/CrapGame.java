package ChapterSix;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class CrapGame {
    public static void main(String[] args) {

        int diceSum = rollDice();
        gameStatus(diceSum);

    }

    public static int point;
    public static String status;

    public static int rollDice() {
        SecureRandom random = new SecureRandom();
        int firstDice = 1 + random.nextInt(6);
        int secondDice = 1 + random.nextInt(6);

        System.out.println("You rolled " + firstDice + " and " + secondDice);
        System.out.println("The sum of rolled dice is " + (firstDice + secondDice));

        return firstDice + secondDice;
    }

    public static void gameStatus(int sum) {

        if (sum == 7 || sum == 11) {
            status = "You Win";
            System.out.println(status);
        } else if (sum == 2 || sum == 3 || sum == 12) {
            status = "You Lose";
            System.out.println("You Lose, THE HOUSE WINS!");
        } else {
            status = "You Continue";
            point = sum;
            toContinue();
        }
    }

    private static void toContinue() {

        while(status == "You Continue") {
            int sum = rollDice();
            if (sum == point) status = "You Win";
            else if (sum == 7) status = "You Lose, THE HOUSE WINS!";
        }
        System.out.println(status);
    }


}

