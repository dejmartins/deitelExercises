package Assignments;

import java.util.Scanner;

public class StudentsReportMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of students to be recorded: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Number of subjects offered by students: ");
        int numberOfSubjects = input.nextInt();

        int[][] studentsGrades = new int[numberOfStudents][numberOfSubjects];

        for(int student = 0; student < studentsGrades.length; student++){
            System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
            System.out.println("Student " + (student + 1));

            for(int subject = 0; subject < studentsGrades[student].length; subject++){
                System.out.print("Subject " + (subject + 1) + ": ");
                int score = input.nextInt();
                studentsGrades[student][subject] = score;
            }

            System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

        Report afinClass = new Report(studentsGrades);

        System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
        System.out.println("=================================================================");
        System.out.print("STUDENTS");
        for(int header = 0; header < numberOfSubjects; header++){
            System.out.printf("%6s%s%d", " ", "SUB", (header + 1));
        }
        System.out.printf("%9s%7s%7s%n", "TOTAL", "AVG", "POS");
        System.out.println("=================================================================");


        for(int student = 0; student < numberOfStudents; student++){

            System.out.print("Student " + (student + 1));
            for (int grade = 0; grade < studentsGrades[student].length; grade++){
                System.out.printf("%9d", studentsGrades[student][grade]);
            }

            int total = afinClass.gradeSumOfStudent(student);
            double average = afinClass.averageOfStudent(student);
            int position = afinClass.positionOfStudent(student);
            System.out.printf("%9d%9.2f%5d", total, average, position);
            System.out.println();
        }
        System.out.println("=================================================================");
        System.out.println();
        System.out.println("=================================================================");

        System.out.println();

        System.out.println("SUBJECT SUMMARY");
        for(int subjectIndex = 0; subjectIndex < numberOfSubjects; subjectIndex++){
            afinClass.subjectSummary(subjectIndex);
            System.out.println();
        }
        System.out.printf("The overall highest score is scored by Student %s%n", afinClass.getHighestGrade());
        System.out.printf("The overall lowest score is scored by Student %s%n", afinClass.getLowestGrade());

        System.out.println("=================================================================");
        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println("=================================================================");
        System.out.printf("Best Graduating Student is: %s%n", afinClass.getBGS());
        System.out.println("=================================================================");
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.printf("Worst Graduating Student is: %s%n", afinClass.getWGS());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("=================================================================");
        System.out.printf("Class total score is: %d%n", afinClass.totalSum());
        System.out.printf("Class total average score is: %.2f%n", afinClass.totalAverage());
        System.out.println("=================================================================");



    }

}
