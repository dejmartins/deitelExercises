package DataStructures;

import DataStructures.LinkedLists.DoublyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoublyLinkedListTest {

    DoublyLinkedList<String> list;

    @BeforeEach
    public void startsWith(){
        list = new DoublyLinkedList<>();
    }

    @Test
    public void linkedListIsEmpty(){
        assertTrue(list.isEmpty());
    }

    @Test
    public void addToHeadOfTheListTest(){
         list.addFirst("Potatoes");
        assertEquals(1, list.size());
        assertEquals("Potatoes", list.first());
    }

    @Test
    public void addToLastOfTheListTest(){
        list.addFirst("Bread");
        list.addLast("Rice");
        assertEquals(2, list.size());
        assertEquals("Rice", list.last());
    }

    @Test
    public void removeFirstTest(){
        list.addFirst("Bread");
        list.addLast("Rice");
        String mealRemoved = list.removeFirst();
        assertEquals(1, list.size());
        assertEquals("Bread", mealRemoved);
        assertEquals("Rice", list.first());
    }

    @Test
    public void removeLastTest(){
        list.addFirst("Bread");
        list.addLast("Rice");
        String mealRemoved = list.removeLAst();
        assertEquals(1, list.size());
        assertEquals("Rice", mealRemoved);
        assertEquals("Bread", list.first());
    }
}
