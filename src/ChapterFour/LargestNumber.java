package ChapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int number = 0;
        int largestNumber = 0;

        while(counter <= 10){
            System.out.print("Enter number: ");
            number = sc.nextInt();

            if(number > largestNumber)
                largestNumber = number;

            counter++;
        }
        System.out.println("The largest number is "+ largestNumber);
    }
}
