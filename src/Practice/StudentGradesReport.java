package Practice;

public class StudentGradesReport {

    int[][] grades = new int[5][6];

    public StudentGradesReport(int[][] grades) {
        this.grades = grades;
    }

    public int getSumForStudent(int indexNumber) {
        int sum = 0;
        for (int counter = 0; counter < grades[indexNumber].length; counter++) {
            sum += grades[indexNumber][counter];
        }
        return sum;
    }

    public double getAverageForStudent(int indexNumber) {
        return (double) getSumForStudent(indexNumber) / grades[indexNumber].length;
    }

    public int getStudentPosition(int indexNumber) {
        // get the sum
        int [] arrayOfStudentSum = new int[grades.length];
        for(int student = 0; student < grades.length; student++){
            //store the sum in an array
            arrayOfStudentSum[student] = getSumForStudent(student);
        }







        //sort in descending order
        //get the index of the student using the sum
        //add one to the index

        return 0;
    }
}
