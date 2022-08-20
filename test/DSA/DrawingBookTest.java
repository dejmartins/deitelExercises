package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {

    @Test
    public void testNumberOfPagesFlip(){
        DrawingBook book = new DrawingBook(5, 3);
        int result = book.pageCount();
        assertEquals(1, result);
    }

    @Test
    public void testNumberOfPagesFlip2(){
        DrawingBook book = new DrawingBook(5, 4);
        int result = book.pageCount();
        assertEquals(0, result);
    }

    @Test
    public void testNumberOfPagesFlip3(){
        DrawingBook book = new DrawingBook(6, 2);
        int result = book.pageCount();
        assertEquals(1, result);
    }

    @Test
    public void testNumberOfPagesFlip4(){
        DrawingBook book = new DrawingBook(6, 5);
        int result = book.pageCount();
        assertEquals(1, result);
    }

    @Test
    public void testNumberOfPagesFlip5(){
        DrawingBook book = new DrawingBook(4, 4);
        int result = book.pageCount();
        assertEquals(0, result);
    }

}