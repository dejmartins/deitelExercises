package Assignments;

import java.util.Arrays;

public class Report {

    private int[][] grades;

    public Report(int[][] grades) {
        this.grades = grades;
    }

    public int totalSum() {
        int sum = 0;

        for (int[] student : grades) {
            for (int grade : student) {
                sum += grade;
            }
        }
        return sum;
    }

    public int gradeSumOfStudent(int studentIndex) {
        int total = 0;
        for (int count = 0; count < grades[studentIndex].length; count++) {
            total += grades[studentIndex][count];
        }
        return total;
    }

    public double totalAverage() {
        double total = 0;
        for (int index = 0; index < grades.length; index++) {
            total += averageOfStudent(index);
        }
        return total;
    }

    public double averageOfStudent(int studentIndex) {
        int sum = gradeSumOfStudent(studentIndex);
        int total = 0;
        for (int count = 0; count < grades[studentIndex].length; count++) {
            total++;
        }
        return (double) sum / total;
    }

    public int positionOfStudent(int studentIndex) {
        int sum = gradeSumOfStudent(studentIndex);
        Integer[] gradeSum = new Integer[grades.length];
        int total;

        //Get the sum of each student and store it in an array
        for (int counter = 0; counter < grades.length; counter++) {
            total = 0;
            for (int counter1 = 0; counter1 < grades[counter].length; counter1++) {
                total += grades[counter][counter1];
                gradeSum[counter] = total;
            }
        }

        //Re-arrange elements of array in descending order
        for (int index = 0; index < gradeSum.length; index++) {
            for (int nextIndex = index + 1; nextIndex < gradeSum.length; nextIndex++) {
                if (gradeSum[index] < gradeSum[nextIndex]) {
                    int temp;
                    temp = gradeSum[index];
                    gradeSum[index] = gradeSum[nextIndex];
                    gradeSum[nextIndex] = temp;
                }
            }
        }

        return Arrays.asList(gradeSum).indexOf(sum) + 1;
    }

    public int highestScoreInSubject(int subjectIndex) {
        int highestScore = grades[0][subjectIndex];

        // Loop to get the highest score
        for (int counter = 1; counter < grades.length; counter++) {
            if (grades[counter][subjectIndex] > highestScore)
                highestScore = grades[counter][subjectIndex];
        }

        return highestScore;
    }

    public int lowestScoreInSubject(int subjectIndex) {
        int lowestScore = grades[0][subjectIndex];

        for (int counter = 1; counter < grades.length; counter++) {
            if (grades[counter][subjectIndex] < lowestScore)
                lowestScore = grades[counter][subjectIndex];
        }
        return lowestScore;
    }

    public int totalGradeInSubject(int subjectIndex) {
        int total = 0;
        for (int counter = 0; counter < grades.length; counter++) {
            total += grades[counter][subjectIndex];
        }
        return total;
    }


    public double averageScoreInSubject(int subjectIndex) {
        int sum = totalGradeInSubject(subjectIndex);
        return (double) sum / grades.length;
    }

    public int passesInSubject(int subjectIndex) {
        int passes = 0;
        for (int counter = 0; counter < grades.length; counter++) {
            if (grades[counter][subjectIndex] >= 50) passes++;
        }
        return passes;
    }

    public int failsInSubject(int subjectIndex) {
        int fails = 0;
        for (int counter = 0; counter < grades.length; counter++) {
            if (grades[counter][subjectIndex] < 50) fails++;
        }
        return fails;
    }

    public String hardestSubject() {
        int[] numberOfFailures = new int[grades.length];
        int[] totalPerSubject = new int[grades.length];
        int fails = 0;

        for (int count1 = 0; count1 < grades.length; count1++) {
            for (int index1 = 0; index1 < grades[count1].length; index1++) {
                int total = totalGradeInSubject(index1);
                totalPerSubject[index1] = total;
            }
        }

        int lowestSum = totalPerSubject[0];
        for (int element : totalPerSubject) {
            if (element < lowestSum) lowestSum = element;
        }

        int subject = 0;
        for (int index = 0; index < totalPerSubject.length; index++) {
            if (lowestSum == totalPerSubject[index]) subject = index;
        }

        //Get the number of failures for each subject & store in an array
        for (int count = 0; count < grades.length; count++) {
            for (int index = 0; index < grades[count].length; index++) {
                fails = failsInSubject(index);
                numberOfFailures[index] = fails;
            }
        }

        int highestNumber = highestInArray(numberOfFailures);

        return (subject + 1) + " with " + highestNumber + " failures";
    }

    public String easiestSubject() {
        int[] numberOfPasses = new int[grades.length];
        int[] totalPerSubject = new int[grades.length];

        for (int count1 = 0; count1 < grades.length; count1++) {
            for (int index1 = 0; index1 < grades[count1].length; index1++) {
                int total = totalGradeInSubject(index1);
                totalPerSubject[index1] = total;
            }
        }

        int highestSum = highestInArray(totalPerSubject);

        int subject = 0;
        for (int index = 0; index < totalPerSubject.length; index++) {
            if (highestSum == totalPerSubject[index]) subject = index;
        }

        for (int count = 0; count < grades.length; count++) {
            for (int index = 0; index < grades[count].length; index++) {
                int passes = passesInSubject(index);
                numberOfPasses[index] = passes;
            }
        }

        int highestNumber = highestInArray(numberOfPasses);

        return (subject + 1) + " with " + highestNumber + " passes";
    }


    public String getHighestGrade() {

        int student = 0;
        int subject = 0;
        int[] highest = new int[grades.length];
        for (int count = 0; count < grades.length; count++) {
            for (int index = 0; index < grades[count].length; index++) {
                highest[index] = highestScoreInSubject(index);
            }
        }

        int highestScore = highestInArray(highest);

        return getString(student, subject, highestScore);
    }

    public String getLowestGrade() {
        int student = 0;
        int subject = 0;
        int[] lowest = new int[grades.length];

        for (int count = 0; count < grades.length; count++) {
            for (int index = 0; index < grades[count].length; index++) {
                lowest[index] = lowestScoreInSubject(index);
            }
        }

        int lowestScore = lowest[0];
        for (int element : lowest) {
            if (element != 0) {
                if (element < lowestScore) lowestScore = element;
            }
        }
        return getString(student, subject, lowestScore);
    }

    private String getString(int student, int subject, int lowestScore) {
        for (int students = 0; students < grades.length; students++) {
            for (int subjects = 0; subjects < grades[students].length; subjects++) {
                if (lowestScore == grades[students][subjects]) {
                    student = students;
                    subject = subjects;
                }
            }
        }
        return (student + 1) + " in Subject " + (subject + 1) + " scoring " + lowestScore;
    }

    public String getBGS() {
        int[] studentGrade = new int[grades.length];
        for (int counter = 0; counter < grades.length; counter++) {
            int sum = gradeSumOfStudent(counter);
            studentGrade[counter] = sum;
        }

        int totalSum = highestInArray(studentGrade);
        int student = getIndex(studentGrade);

        return student + " scoring " + totalSum;
    }

    public int highestInArray(int[] studentGrade) {
        int totalSum = studentGrade[0];
        for (int element : studentGrade) {
            if (element > totalSum) totalSum = element;
        }
        return totalSum;
    }

    public int getIndex(int[] studentGrade) {
        int totalSum = highestInArray(studentGrade);
        int student = 0;
        for (int i = 0; i < studentGrade.length; i++) {
            if (studentGrade[i] == totalSum) student = i;
        }
        return student + 1;
    }

    public String getWGS() {
        int[] studentGrade = new int[grades.length];
        for (int counter = 0; counter < grades.length; counter++) {
            int sum = gradeSumOfStudent(counter);
            studentGrade[counter] = sum;
        }

        int totalSum = studentGrade[0];
        for (int element : studentGrade) {
            if (element < totalSum) totalSum = element;
        }

        int student = 0;
        for (int i = 0; i < studentGrade.length; i++) {
            if (studentGrade[i] == totalSum) student = i;
        }

        return (student + 1) + " scoring " + totalSum;
    }

    public void subjectSummary(int subjectIndex) {
        System.out.printf("%s%d%n", "Subject ", (subjectIndex + 1));
        System.out.printf("Highest scoring student is: Student %s%n", highestScoreInSubject(subjectIndex));
        System.out.printf("Lowest scoring student is: Student %s%n", lowestScoreInSubject(subjectIndex));
        System.out.printf("Total score is: %d%n", totalGradeInSubject(subjectIndex));
        System.out.printf("Average score is: %.2f%n", averageScoreInSubject(subjectIndex));
        System.out.printf("Number of passes: %d%n", passesInSubject(subjectIndex));
        System.out.printf("Number of fails: %d%n", failsInSubject(subjectIndex));
        System.out.printf("The hardest subject is Subject %s%n", hardestSubject());
        System.out.printf("The easiest subject is Subject %s%n", easiestSubject());

    }


}