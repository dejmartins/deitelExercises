package tddClass.ChapterEight;

import ChapterEight.SetOfIntegers.SetOfIntegers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetOfIntegersTest {
    // todo:
    //  Test to check if two sets are equal


    @Test
    public void noValueInSetTest(){
        SetOfIntegers set = new SetOfIntegers();
        assertFalse(set.isInSet(2));
    }

    @Test
    public void insertSetElementTest(){
        SetOfIntegers set = new SetOfIntegers();
        set.insertElement(5);
        set.insertElement(20);
        assertTrue(set.isInSet(5));
    }

    @Test
    public void setUnionTest(){
        SetOfIntegers set1 = new SetOfIntegers();
        set1.insertElement(5);
        SetOfIntegers set2 = new SetOfIntegers();
        set1.insertElement(95);
        SetOfIntegers set3 = set1.union(set2);
        assertTrue(set3.isInSet(5));
        assertTrue(set3.isInSet(95));
    }

    @Test
    public void setIntersectionTest(){
        SetOfIntegers set1 = new SetOfIntegers();
        set1.insertElement(5);
        set1.insertElement(6);
        SetOfIntegers set2 = new SetOfIntegers();
        set2.insertElement(5);
        SetOfIntegers set3 = set1.intersect(set2);

        assertTrue(set3.isInSet(5));
        assertFalse(set3.isInSet(6));
    }

    @Test
    public void deleteElementTest(){
        SetOfIntegers set = new SetOfIntegers();
        set.insertElement(5);
        set.insertElement(6);
        set.deleteELement(5);
        assertFalse(set.isInSet(5));
    }

    @Test
    public void setIsEqualTest(){
        SetOfIntegers set1 = new SetOfIntegers();
        set1.insertElement(5);
        set1.insertElement(6);
        SetOfIntegers set2 = new SetOfIntegers();
        set2.insertElement(5);
        set2.insertElement(6);
        assertTrue(set1.isEqualTo(set2));
    }
}
