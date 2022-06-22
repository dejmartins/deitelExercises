package DataStructures;

import DataStructures.LinkedLists.CircularlyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircularlyLinkedListTest {

    CircularlyLinkedList<String> list;

    @BeforeEach
    public void startsWith(){
        list = new CircularlyLinkedList<>();
    }

    @Test
    public void checkThatLikedListIsEmpty(){
        assertTrue(list.isEmpty());
    }

    @Test
    public void elementCanBeAddedToFirstTest(){
        list.addFirst("Egypt");
        assertEquals(1, list.size());
    }

    @Test
    public void elementCanBeAddedToLastTest(){
        list.addFirst("Egypt");
        list.addLast("Ghana");
        assertEquals(2, list.size());
    }

    @Test
    public void removeFirstTest(){
        list.addFirst("Egypt");
        list.addFirst("Nigeria");
        list.addLast("Ghana");
        String country = list.removeFirst();
        assertEquals(2, list.size());
        assertEquals("Nigeria", country);
    }

    @Test
    public void getFirstAndLastTest(){
        list.addFirst("Egypt");
        list.addFirst("Nigeria");
        list.addLast("Ghana");
        String country = list.removeFirst();
        assertEquals("Egypt", list.first());
        assertEquals("Ghana", list.last());
    }

    @Test
    public void linkedListCanBeRotated(){
        list.addFirst("Nigeria");
        list.addLast("Ghana");
        list.rotate();
        assertEquals("Nigeria", list.last());
        assertEquals("Ghana", list.first());
    }
}
