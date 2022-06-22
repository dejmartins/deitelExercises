package DataStructures;

import DataStructures.LinkedLists.SinglyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SinglyLinkedListTest {

    SinglyLinkedList<String> list;

    @BeforeEach
    public void startsWith(){
        list = new SinglyLinkedList<>();
    }

    @Test
    public void listIsEmptyTest(){
        assertTrue(list.isEmpty());
    }

    @Test
    public void addToLinkedListTest(){
        list.addFirst("Kola");
        assertEquals(1, list.size());
    }

    @Test
    public void addToLastPosition_LinkedListAddLAst(){
        list.addLast("Kevin");
        assertEquals(1, list.size());
    }

    @Test
    public void removeElementFromLastTest(){
        list.addFirst("Kola");
        list.addFirst("Kevwe");
        assertEquals("Kevwe", list.removeFirst());
        assertEquals(1, list.size());
    }

    @Test
    public void getFirstElement(){
        list.addFirst("Kola");
        list.addFirst("Kevwe");
        assertEquals("Kevwe", list.first());
        assertEquals(2, list.size());
    }

    @Test
    public void getLastElement(){
        list.addFirst("Kola");
        list.addFirst("Kevwe");
        assertEquals("Kola", list.last());
        assertEquals(2, list.size());
    }
}
