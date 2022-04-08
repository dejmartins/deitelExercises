package Practice;

import java.util.Scanner;

public class sumOfMultiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Pass in a number: ");
        int number = input.nextInt();

        for(int counter = 3; counter < number; counter++){
            if(counter % 3 == 0 && counter % 5 == 0){
                System.out.print(counter + " ");
                total += counter;
            } else if (counter % 3 == 0 || counter % 5 == 0){
                System.out.print(counter + " ");
                total += counter;
            }
        }

        System.out.println();
        System.out.println("The sum of the multiples is " + total);
    }
}
