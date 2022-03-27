package ChapterFive;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        String name;
        String grade;

        System.out.println("Enter student name and letter grade");
        for(int counter = 1; counter <=5 ; counter++){
            name = in.nextLine();
            grade = in.nextLine();

            switch (grade){
                case "A":
                    aCount++;
                    break;
                case "B":
                    bCount++;
                    break;
                case "C":
                    cCount++;
                    break;
                default:
                    dCount++;
            }
        }
        System.out.printf("%d number of students got A%n", aCount);
        System.out.printf("%d number of students got B%n", bCount);
        System.out.printf("%d number of students got C%n", cCount);
        System.out.printf("%d number of students got D%n", dCount);
    }
}