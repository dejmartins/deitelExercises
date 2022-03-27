package ChapterFive;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check the multiplication table");
        int digit = input.nextInt();
        for(int counter = 1; counter <= 12; counter++){
            System.out.printf("%d x %d = %d%n", digit, counter, digit * counter);
        }
    }
}
