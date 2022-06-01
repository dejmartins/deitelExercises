package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;

    @BeforeEach
    public void startsWith(){
        set = new Set();
    }
    @Test
    public void testThatClassExists(){
        assertNotNull(set);
    }

    @Test
    public void testThatElementAddedHasNoDuplicates(){
        set.add(1);
        set.add(2);
        set.add(2);
        assertEquals(2, set.size());
    }

    @Test
    public void testThatAllElementsCanBeCLeared(){
        set.add(1);
        set.add(2);
        set.add(3);
        set.clear();
        assertEquals(0, set.size());
    }

    @Test
    public void testThatElementsCanBeRemoved(){
        set.add(2);
        set.remove(0);
        assertFalse(set.contains(2));
    }
}
