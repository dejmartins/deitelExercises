package ChapterFour;
import java.util.Scanner;
public class ClassAverage {
    /*public static void main(String[] args){

        int total = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);
        while(counter <= 10){
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            counter = counter + 1;
        }

        int average = total / 10;
        System.out.printf("The total of all grades is %d%n ", total);
        System.out.printf("The average is %d%n ", average);
    }*/

    public static void main(String[] args){
        int total = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while(grade != -1){
            total = total + grade;
            counter = counter + 1;
            System.out.print("Enter grade: ");
            grade = input.nextInt();
        }

        if(counter != 0){
            double average = (double) total / counter;
            System.out.printf("The average is %.2f%n", average);
        }
        else {
            System.out.println("No grades were entered");
        }
    }

    /*public static void main(String[] args){
        int passes = 0;
        int failures = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);
        while(counter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            if(result == 1){
                passes = passes + 1;
            }
            else {
                failures = failures + 1;
            }
            counter = counter + 1;
        }

        System.out.printf("Passed: %d, failed: %d%n", passes, failures);

        if(passes > 8){
            System.out.println("Bonus to instructor!");
        }*/
    }
}
