package ChapterSeven;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int[] frequency = new int[7];

        for(int roll = 1; roll <= 60_000_000; roll++){
            ++frequency[1 + rand.nextInt(6)] ;
        }

        System.out.printf("%s%12s%n", "Face", "Frequency");

        for(int face = 1; face < frequency.length; face++){
            System.out.printf("%d%15d%n", face, frequency[face]);
        }
    }
}
