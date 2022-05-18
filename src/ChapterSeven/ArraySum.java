package ChapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {


//        int sum = 0;
//        int[] numbers = new int[5];
//
//        numbers[0] = 5;
//        numbers[1] = 6;
//        numbers[2] = 4;
//        numbers[3] = 9;
//        numbers[4] = 7;
//
//        for(int counter = 0; counter < numbers.length; counter++){
//            sum += numbers[counter];
//        }

        Scanner scan = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        System.out.print("Input number of rows: ");
        int numberOfRows = scan.nextInt();
        System.out.print("Input number of columns: ");
        int numberOfColumns = scan.nextInt();

        int[][] numbers = new int[numberOfRows][numberOfColumns];

        // Loading array with random numbers
        for(int rowLoop = 0; rowLoop < numbers.length; rowLoop++){
            for(int columnLoop = 0; columnLoop < numbers[rowLoop].length; columnLoop++){
                numbers[rowLoop][columnLoop] = rand.nextInt(100);
            }
        }

        System.out.println("\nThe Array:");
        // Printing out the sum in my multi-dimensional array
        int sum = 0;
        for(int[] rowLoop : numbers){
            for(int columnLoop : rowLoop){
                System.out.printf("%02d ", columnLoop);
                sum += columnLoop;
            }
            System.out.println();
        }
        System.out.println("\nThe sum of elements in the array is: " + sum);
    }
}
