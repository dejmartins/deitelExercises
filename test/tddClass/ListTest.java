package tddClass;

import chapterTen.ArrayList;
import chapterTen.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list;
    @BeforeEach
    public void startsWith(){
        list = new ArrayList<String>();
    }

    @Test
    public void addTest(){
        list.add("Hello World");
        assertEquals(1, list.size());
    }

    @Test
    public void addAndGetTest(){
        list.add("Hello World");
        assertEquals("Hello World", list.get(0));
    }

    @Test
    public void removeTest(){
        list.add("Hello Brother");
        list.add("Hello World");
        list.remove(0);
        assertEquals(1, list.size());
        assertEquals("Hello World", list.get(0));
    }

    @Test
    public void addToPositionTest(){
        list.add("Hello");
        list.add("World");
        list.add(1, "Comma");
        assertEquals("Hello", list.get(0));
        assertEquals("Comma", list.get(1));
        assertEquals("World", list.get(2));
    }

    @Test
    public void removeByItemTest(){
        list.add("Hello Brother");
        list.add("Hello World");
        list.remove("Hello Brother");
        assertEquals(1, list.size());
        assertEquals("Hello World", list.get(0));
    }

    @Test
    public void arrayLimitExceededTest(){
        list.add("Hello Dej");
        list.add("Hello Kevs");
        list.add("Hello Mets");
        list.add("Hello Sebs");
        list.add("Hello RiRi");
        list.add("Hello Yems");
        list.add("Hello Wals");
        assertEquals(7, list.size());
        assertEquals("Hello Kevs", list.get(1));
        list.add(1, "Hello Tols");
        assertEquals("Hello Tols", list.get(1));
    }
}