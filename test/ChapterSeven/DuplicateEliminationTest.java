package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

//    @Test
//    public void testThatInitialValueIsMinusOne(){
//        //Given That
//        int[] arr = new int[10];
//        //When
//        DuplicateElimination duplicateElimination = new DuplicateElimination(arr);
//        //Assert That
//        assertEquals(-1, duplicateElimination.getArr()[0]);
//        assertEquals(-1, duplicateElimination.getArr()[1]);
//    }
//
//    @Test
//    public void testThatThereAreNoDuplicates(){
//        //Given That
//        int[] arr = new int[10];
//        DuplicateElimination duplicateElimination = new DuplicateElimination(arr);
//        //When
//        duplicateElimination.input(11);
//        duplicateElimination.input(21);
//        duplicateElimination.input(31);
//        duplicateElimination.input(21);
//        duplicateElimination.input(11);
//        duplicateElimination.input(51);
//        duplicateElimination.input(61);
//        duplicateElimination.input(71);
//        duplicateElimination.input(31);
//        duplicateElimination.input(11);
//        //Assert
//        assertEquals("[11, 21, 31, -1, -1, 51, 61, 71, -1, -1]", Arrays.toString(duplicateElimination.getArr()));
//    }

    @Test
    public void testThatMinusOneIsNotDisplayed(){
        //Given That
        int[] arr = new int[10];
        DuplicateElimination duplicateElimination = new DuplicateElimination(arr);
        //When
        duplicateElimination.input(11);
        duplicateElimination.input(21);
        duplicateElimination.input(31);
        duplicateElimination.input(21);
        duplicateElimination.input(11);
        duplicateElimination.input(51);
        duplicateElimination.input(61);
        duplicateElimination.input(71);
        duplicateElimination.input(31);
        duplicateElimination.input(11);
        //Assert
        assertEquals("11 21 31 51 61 71 ", duplicateElimination.getArr());
    }
}