package tddClass;

import Assignments.ArrayPractice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class tenElementsArray {
    @Test
    public void arrayHasTenElementsTest(){
        ArrayPractice array = new ArrayPractice();
        int[] randomNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertNotNull(randomNumbers);
        assertEquals(10, randomNumbers.length);
    }

    @Test
    public void printArrayElementsTest(){
        int[] randomNumbers = {1, 2, 3, 4, 53, 6, 7, 8, 9, 10};
        ArrayPractice.getArrayElements(randomNumbers);
    }

    @Test
    public void arrayMaximumNumberTest(){
        int[] randomNumbers = {1, 2, 35, 4, 5, 6, 7, 8, 9, 10};
        int result = ArrayPractice.getMaximumNumber(randomNumbers);
        assertEquals(35, result);
    }

    @Test
    public void sumOfArraysTest(){
        int[] randomNumbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 5};
        int result = ArrayPractice.sumOfElements(randomNumbers);
        assertEquals(14, result);
    }

    @Test
    public void averageOfArraysTest(){
        int[] randomNumbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int result = ArrayPractice.averageOfElements(randomNumbers);
        assertEquals(1, result);
    }

    @Test
    public void arrayMinimumNumberTest(){
        int[] randomNumbers = {34, 23, 14, 45, 23};
        int result = ArrayPractice.getMinimumNumber(randomNumbers);
        assertEquals(14, result);
    }
}
