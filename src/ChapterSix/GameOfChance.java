package ChapterSix;

import java.security.SecureRandom;

public class GameOfChance {
    public static void main(String[] args) {
        int roll = rollDice();
        status(roll);
    }

    private static int point;
    private static String gameStatus;

    public static int rollDice() {
        SecureRandom random = new SecureRandom();
        int firstDiceFace = 1 + random.nextInt(6);
        int secondDiceFace = 1 + random.nextInt(6);

        System.out.println("You rolled " + firstDiceFace + " and " + secondDiceFace);
        System.out.println("The sum of rolled dice is " + (firstDiceFace + secondDiceFace));

        return firstDiceFace + secondDiceFace;
    }

    public static String status(int roll) {
        if (roll == 7 || roll == 11) {
            gameStatus = "You Win";
            System.out.println(gameStatus);
        }
        else if (roll == 2 || roll == 3 || roll == 12) {
            gameStatus = "You Lose, THE HOUSE WINS!";
            System.out.println(gameStatus);
        }
        else {
            gameStatus = "You Continue";
            point = roll;
            toContinue();
        }

        return gameStatus;
    }

    public static void toContinue(){
        while(gameStatus == "You Continue") {
            int sum = rollDice();
            if (sum == point) gameStatus = "You Win";
            else if (sum == 7) gameStatus = "You Lose, THE HOUSE WINS!";
        }

        System.out.println(gameStatus);
    }
}

