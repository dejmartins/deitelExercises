package ChapterSeven;

public class GradeBookMultiDimensional {
    private String courseName;
    private int[][] grades;

    public GradeBookMultiDimensional(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMinimum() {
        int lowestGrade = grades[0][0];

        //loop through the array rows...
        for (int[] rowValues : grades) {

            //loop through column in the current array...
            for (int columnValues : rowValues) {
                if (columnValues < lowestGrade) lowestGrade = columnValues;
            }
        }

        return lowestGrade;
    }

    public int getMaximum() {
        int highestValue = grades[0][0];

        for (int rowValues[] : grades) {

            for (int columnValues : rowValues) {
                if (columnValues > highestValue) highestValue = columnValues;
            }
        }

        return highestValue;
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        }

        return (double) total / setOfGrades.length;
    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("            ");

        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("  Test %d ", test + 1);
        }

        System.out.println(" Average");

        for (int student = 0; student < grades.length; student++) {

            System.out.printf("Student %3d: ", student + 1);

            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            }

            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }

    }

    public void processGrade() {

        outputGrades();

        System.out.printf("The minimum grade is: %d%n", getMinimum());
        System.out.printf("The maximum grade is: %d%n%n", getMaximum());

        outputBarChart();
    }

    public void outputBarChart(){
        System.out.println("Overall grade distribution: ");

        int[] frequency = new int[11];

        for(int[] studentGrade : grades){

            for(int grade : studentGrade){
                frequency[grade / 10]++;
            }

        }

        for(int counter = 0; counter < frequency.length; counter++){

            if(counter == 10){
                System.out.printf("%7d: ", 100);
            }
            else {

                System.out.printf("%02d - %02d: ", counter * 10, counter * 10 + 9);
            }
            for(int star = 0; star < frequency[counter]; star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
