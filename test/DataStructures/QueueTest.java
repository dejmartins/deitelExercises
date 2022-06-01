package DataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {
    @Test
    public void testThatAnElementIsAddedToTheQueue(){
        Queue pQueue = new Queue();
        pQueue.add(5);
        assertTrue(pQueue.contains(5));
    }

    @Test
    public void testThatAnElementCanBeRemoved(){
        Queue pQueue = new Queue();
        pQueue.add(0);
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(3);
        assertEquals(0, pQueue.peek());
        pQueue.remove();
        assertEquals(1, pQueue.peek());
    }

    @Test
    public void testToPollElement(){
        Queue pQueue = new Queue();
        pQueue.add(0);
        pQueue.add(1);
        pQueue.add(1);
        int removed = pQueue.poll();
        assertEquals(0, removed);
    }

    @Test
    public void checkTheSizeOfQueue(){
        Queue pQueue = new Queue();
        pQueue.add(0);
        pQueue.add(1);
        assertEquals(2, pQueue.size());
    }
}
