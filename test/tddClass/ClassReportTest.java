package tddClass;

import Assignments.Report;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassReportTest {

    @Test
    public void testSumOfAllStudentsGrades() {
        int[][] grades = {{50, 50}, {50, 50}};
        Report afinClass = new Report(grades);
        assertEquals(200, afinClass.totalSum());
    }

    @Test
    public void testSumOfStudentXGrades() {
        int[][] grades = {{30, 50}, {50, 50}};
        Report afinClass = new Report(grades);
        int result = afinClass.gradeSumOfStudent(0);
        assertEquals(80, result);
        result = afinClass.gradeSumOfStudent(1);
        assertEquals(100, result);
    }

    @Test
    public void testStudentsOverallAverage() {
        int[][] grades = {{5, 10}, {5, 5}};
        Report afinClass = new Report(grades);
        assertEquals(12.5, afinClass.totalAverage());
    }

    @Test
    public void testStudentXAverage() {
        int[][] grades = {{30, 50}, {50, 50}};
        Report afinClass = new Report(grades);
        assertEquals(40.0, afinClass.averageOfStudent(0));
        assertEquals(50.0, afinClass.averageOfStudent(1));
    }

    @Test
    public void testStudentPosition() {
        int[][] grades = {{60, 50}, {40, 50}, {100, 20}};
        Report afinClass = new Report(grades);
        assertEquals(2, afinClass.positionOfStudent(0));
        assertEquals(3, afinClass.positionOfStudent(1));
        assertEquals(1, afinClass.positionOfStudent(2));
    }

    @Test
    public void testHighestScorePerSubject() {
        int[][] grades = {{60, 60}, {40, 50}, {100, 20}};
        Report afinClass = new Report(grades);
        assertEquals(100, afinClass.highestScoreInSubject(0));
        assertEquals(60, afinClass.highestScoreInSubject(1));
    }

    @Test
    public void testLowestScorePerSubject() {
        int[][] grades = {{6, 50}, {40, 50}, {100, 20}};
        Report afinClass = new Report(grades);
        assertEquals(6, afinClass.lowestScoreInSubject(0));
    }

    @Test
    public void testTotalScorePerSubject() {
        int[][] grades = {{60, 50}, {40, 50}, {100, 20}};
        Report afinClass = new Report(grades);
        assertEquals(200, afinClass.totalGradeInSubject(0));
        assertEquals(120, afinClass.totalGradeInSubject(1));
    }

    @Test
    public void testAverageScorePerSubject() {
        int[][] grades = {{10, 50}, {10, 50}, {10, 20}};
        Report afinClass = new Report(grades);
        assertEquals(10.0, afinClass.averageScoreInSubject(0));
    }

    @Test
    public void testNumberOfPassesPerSubject() {
        int[][] grades = {{10, 50}, {10, 50}, {10, 20}};
        Report afinClass = new Report(grades);
        assertEquals(0, afinClass.passesInSubject(0));
        assertEquals(2, afinClass.passesInSubject(1));
    }

    @Test
    public void testNumberOfFailsPerSubject() {
        int[][] grades = {{10, 50}, {10, 50}, {10, 20}};
        Report afinClass = new Report(grades);
        assertEquals(3, afinClass.failsInSubject(0));
        assertEquals(1, afinClass.failsInSubject(1));
    }

    @Test
    public void testHardestSubject(){
        int[][] grades = {{100, 30}, {400, 50}};
        Report afinClass = new Report(grades);
        assertEquals("2 with 1 failures", afinClass.hardestSubject());
    }

    @Test
    public void testEasiestSubject(){
        int[][] grades = {{100, 30}, {400, 50}};
        Report afinClass = new Report(grades);
        assertEquals("1 with 2 passes", afinClass.easiestSubject());
    }

    @Test
    public void testOverallHighestGrade(){
        int[][] grades = {{100, 50}, {400, 50}, {100, 20}};
        Report afinClass = new Report(grades);
        assertEquals("2 in Subject 1 scoring 400", afinClass.getHighestGrade());
    }

    @Test
    public void testOverallLowestGrade(){
        int[][] grades = {{100, 50}, {400, 50}, {100, 20}};
        Report afinClass = new Report(grades);
        assertEquals("3 in Subject 2 scoring 20", afinClass.getLowestGrade());
    }

    @Test
    public void testBestGraduatingStudent(){
        int[][] grades = {{100, 50}, {400, 50}, {100, 20}};
        Report afinClass = new Report(grades);
        assertEquals("2 scoring 450", afinClass.getBGS());
    }

    @Test
    public void testWorstGraduatingStudent(){
        int[][] grades = {{100, 50}, {400, 50}, {78, 76}, {10, 10}};
        Report afinClass = new Report(grades);
        assertEquals("4 scoring 20", afinClass.getWGS());
    }

}
