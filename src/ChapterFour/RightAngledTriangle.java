package ChapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("Enter the length of the base of the triangle: ");
         int triangleBase = input.nextInt();

         int counter = 1;

         if(triangleBase >= 1 && triangleBase <= 10) {
             for (int columnCounter = 1; columnCounter <= triangleBase; columnCounter++) {
                 for (int asteriskCounter = 1; asteriskCounter <= columnCounter; asteriskCounter++) {
                     System.out.print("* ");
                 }
                 System.out.println();
             }
         }

         }

    }
