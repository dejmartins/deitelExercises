package ChapterFive;

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minimumNumber = 0;

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        minimumNumber = number;

        for(int counter = 1; counter <= 9; counter++){
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if(number < minimumNumber) minimumNumber = number;
        }

        System.out.println(minimumNumber);
    }
}
