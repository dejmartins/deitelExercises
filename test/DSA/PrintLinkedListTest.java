package DSA;

import DSA.PrintLinkedList.LinkedList;
import DSA.PrintLinkedList.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;


class PrintLinkedListTest {

    LinkedList<Integer> list;

    @BeforeEach
    public void startsWith(){
        list = new LinkedList<>();
    }

    @Test
    public void testThatLinkedListClassExists(){
        assertNotNull(list);
    }

    @Test
    public void testThatLinkedListHasA_HeadNode(){
        Integer head = list.getHead();
        assertNull(head);
    }

    @Test
    public void testThatANodeHasAnElement_And_ANextNodePointer(){
        Node<Integer> node = new Node<>(null, null);
        Integer element = node.getElement();
        Node<Integer> next = node.getNext();
        assertNull(element);
        assertNull(next);
    }

    @Test
    public void testToAddValueToTheLast(){
        Node<Integer> next = new Node<>(null, null);
        Node<Integer> newNode = new Node<>(16, next);
        list.addToLast(newNode);
        Integer first = list.getHead();
        Integer last = list.getTail();
        assertEquals(16, first);
        assertEquals(16, last);
    }

    @Test
    public void testToAddMultipleValuesToTheLast(){
        Node<Integer> next = new Node<>(null, null);
        Node<Integer> newNode = new Node<>(16, next);
        Node<Integer> newNode2 = new Node<>(13, next);

        list.addToLast(newNode);
        Integer first = list.getHead();
        Integer last = list.getTail();
        assertEquals(16, first);
        assertEquals(16, last);

        list.addToLast(newNode2);
        Integer newFirst = list.getHead();
        Integer newLast = list.getTail();
        assertEquals(16, newFirst);
        assertEquals(13, newLast);
    }

    @Test
    public void testToTraverseALinkedList(){
        Node<Integer> next = new Node<>(null, null);
        Node<Integer> newNode = new Node<>(16, next);
        Node<Integer> newNode2 = new Node<>(13, next);
        list.addToLast(newNode);
        list.addToLast(newNode2);

        assertEquals("16 13 ", list.getAllElements());
    }
}