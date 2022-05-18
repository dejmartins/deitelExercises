package tddClass;

import Assignments.Diary.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    public void startsWith(){
        diary = new Diary();
        diary.signup("kay@gmail.com", "kayCool", "pass123");
    }

    @Test
    public void noDuplicateEmailTest(){
        assertTrue(diary.userExists("kay@gmail.com", "kayCool", "pass123"));
        diary.signup("kay@gmail.com", "metSol", "pass419");
        assertFalse(diary.userExists("kay@gmail.com", "metSol", "pass419"));
    }

    @Test
    public void lockAndUnlockTest(){
        diary.logOut();
        assertTrue(diary.isLocked());
        diary.logIn("kayCool", "pass123");
        assertFalse(diary.isLocked());
    }

    @Test
    public void createEntryTest(){
        diary.registerEntry("Hello World", "Sending a big hello to the world");
        assertEquals(1, diary.numberOfEntries());
    }

}

//        Entry entry = diary.findEntry("Hello World");
//        assertEquals("Hello World", entry.getTitle());
//        assertEquals("Sending a big hello to the world", entry.getBody());