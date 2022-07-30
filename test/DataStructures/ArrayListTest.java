package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    ArrayList<L> list;

    @BeforeEach
    public void startsWith(){
        list = new ArrayList<L>();
    }

    @Test
    public void testToAddElementToList(){
        list.add(4);
        assertTrue(list.contains(4));
    }

    @Test
    public void testToRemoveLastElementFromList(){
        list.add(4);
        list.add(5);
        list.add(6);
        list.removeLast();
        assertFalse(list.contains(6));
    }

    @Test
    public void testToRemoveItemByIndex(){
        list.add(2);
        list.add(4);
        list.add(7);
        list.remove(2);
        assertFalse(list.contains(7));
    }

    @Test
    public void testToAddElementToASpecificIndex(){
        list.add(4);
        list.add(8);
        list.add(6, 1);
        assertEquals(6, list.get(1));
    }

    @Test
    public void testToGetNumberOfElementsInArrayList(){
        list.add(2);
        list.add(9);
        list.add(6);
        list.remove(2);
        list.remove(1);
        assertEquals(1, list.size());
    }

    @Test
    public void testThatArrayExpands(){
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(5);
        assertEquals(6, list.size());
    }

    @Test
    public void testThatArrayIsEmpty(){
        list.add(4);
        list.remove(0);
        assertTrue(list.isEmpty());
    }
}
