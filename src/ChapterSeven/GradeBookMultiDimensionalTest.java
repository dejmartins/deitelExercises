package ChapterSeven;

public class GradeBookMultiDimensionalTest {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 97, 67},
                                {45, 54, 100},
                                {93, 48, 82},
                                {56, 89, 100},
                                {83, 48, 29},
                                {100, 91, 20},
                                {38, 82, 46},
                                {84, 26, 100}};

        GradeBookMultiDimensional myGradeBook = new GradeBookMultiDimensional("CS", gradesArray);
        System.out.println("Welcome to " + myGradeBook.getCourseName() + "101");

        myGradeBook.processGrade();
    }
}
