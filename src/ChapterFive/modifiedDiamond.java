package ChapterFive;

import java.util.Scanner;

public class modifiedDiamond {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an odd number in range 1 - 19: ");
        int number = input.nextInt();
        int count = -1;
        int count2 = -1;

        for (int counter = 1; counter <= (number+1)/2; counter++) {
            for(int counter1 = (number+1)/2; counter1 > counter; counter1--){
                System.out.print(" ");
            }

            count += 2;
            for(int counter2 = 1; counter2 <= count; counter2++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.print(" ");
        for (int counter = 1; counter <= number/2; counter++) {
            count2 += 2;
            for (int counter1 = (number - 2); counter1 >= count2; counter1--) {
                System.out.print("*");
            }
            System.out.println();

            for(int counter2 = 0; counter2 <= counter; counter2++){
                System.out.print(" ");
            }

        }

    }
}