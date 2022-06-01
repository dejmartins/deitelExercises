package DataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    @Test
    public void testThatMapClassExists(){
        Map map = new Map();
        assertNotNull(map);
    }

    @Test
    public void testThatAnElementHasAKeyAndValuePair(){
        Map map = new Map();
        map.put(111, "Lagos");
        map.put(112, "Abuja");
        map.put(112, "Abuja");
        assertEquals(2, map.size());
    }

    @Test
    public void testThatElementsCanBeReplaced(){
        Map map = new Map();
        map.put(111, "Lagos");
        map.replace(111, "Abuja");
        assertTrue(map.containsValue("Abuja"));
        assertFalse(map.containsValue("Lagos"));
    }

    @Test
    public void testThatElementContainsKey(){
        Map map = new Map();
        map.put(111, "Lagos");
        assertTrue(map.containsKey(111));
    }
}
