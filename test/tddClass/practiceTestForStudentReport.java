package tddClass;

import Practice.StudentGradesReport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class practiceTestForStudentReport {
//    StudentGradesReport report;
//    @BeforeEach
//    public void startsWith(){
//
//    }
    @Test
    public void testForSumPerStudent(){
        int[][] grades = {{90, 20},
                          {40, 40, 20},
                          {10, 50, 70, 40}};
        StudentGradesReport report = new StudentGradesReport(grades);
        assertEquals(110, report.getSumForStudent(0));
        assertEquals(100, report.getSumForStudent(1));
    }

    @Test
    public void testforStudentAverage(){
        int[][] grades = {{4, 5, 6, 3},
                {40, 40, 20},
                {10, 50, 70}};
        StudentGradesReport report = new StudentGradesReport(grades);
        assertEquals(4.5, report.getAverageForStudent(0));
    }

    @Test
    public void testForStudentPosition(){
        int[][] grades = {{40, 50, 60},
                         {40, 40, 20},
                         {10, 50, 70}};
        StudentGradesReport report = new StudentGradesReport(grades);
        assertEquals(3, report.getStudentPosition(0));
    }
}
