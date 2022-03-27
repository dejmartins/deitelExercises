package ChapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largestNumber = 0;
        int secondLargestNumber = 0;

        for (int counter = 1; counter <= 5; counter++) {
            int number = in.nextInt();

            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            } else if (number > secondLargestNumber)
                secondLargestNumber = number;

        }


    }
}

