package Assignments;

public class HardestSubject {
    // Assuming we have an entry of students grades
    public static int[][] studentGrades = {
            {20, 30, 40},
            {50, 60, 70},
            {10, 20, 90}
    };


    public static void main(String[] args) {
        int[] numberOfFails = new int[studentGrades.length];

        // Looping through each student, per subject
        for (int column = 0; column < studentGrades.length; column++){

            int fails = 0;

            for (int row = 0; row < studentGrades[column].length; row++){

                // Find the number of fails
                if (studentGrades[row][column] < 50) fails++;

            }

            numberOfFails[column] = fails;
        }

        for (int fail : numberOfFails){
            System.out.print(fail + " ");
        }
    }
}
