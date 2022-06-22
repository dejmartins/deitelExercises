package ChapterEight;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();

        System.out.print("How many random numbers do you need? ");
        int numberOfRandomNumbers = sc.nextInt();

        for (int counter = 0; counter < numberOfRandomNumbers; counter++){
            int number = sr.nextInt(10, 100);
            System.out.print(number + " ");
        }
    }
}
