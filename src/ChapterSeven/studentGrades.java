package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students are in your class? ");
        int numberOfStudents = input.nextInt();

        System.out.print("How many courses does your students offer? ");
        int numberOfCourses = input.nextInt();

        int[][] grades = new int[numberOfStudents][numberOfCourses];

        for (int counter = 0; counter < numberOfStudents; counter++){
            System.out.println("Enter score for student " + counter);

            for (int counter1 = 0; counter1 < numberOfCourses; counter1++){
                System.out.print("Course" + counter1 + ": ");
                grades[counter][counter1] = input.nextInt();
            }

            System.out.println();

        }


        for(int counter = 1; counter <= numberOfCourses; counter++){
            System.out.print("          Subject" + counter);
        }

        System.out.println();


        for(int counter = 0; counter < numberOfStudents; counter++){
            System.out.printf("Student%-7d", counter);

            for(int counter1 = 0; counter1 < numberOfCourses; counter1++){
                System.out.printf("%-18d", grades[counter][counter1]);
            }

            System.out.println();
        }



    }


}
