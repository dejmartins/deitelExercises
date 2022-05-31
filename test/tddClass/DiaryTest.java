package tddClass;

import Assignments.Diary.Diary;
import Assignments.Diary.DiaryApp;
import Assignments.Diary.Entries;
import Assignments.Diary.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void createEntryTest(){
        User akin = new User();
        Diary diary = new Diary(akin);
        diary.registerEntry("Hello World", "Sending a big hello to the world");
        diary.registerEntry("Hello Jerusalem", "We are coming to build our city");
        assertEquals(2, diary.numberOfEntries());
    }

    @Test
    public void findEntryTest(){
        User akin = new User();
        Diary diary = new Diary(akin);
        diary.registerEntry("Hello World", "Sending a big hello to the world");
        diary.registerEntry("Hello Jerusalem", "We are coming to build our city");
        Entries entry = diary.findEntryBy("Hello World");
        assertEquals("Hello World", entry.getTitle());
        assertEquals("Sending a big hello to the world", entry.getBody());
    }

    @Test
    public void deleteEntryTest(){
        User akin = new User();
        Diary diary = new Diary(akin);
        diary.registerEntry("Hello World", "Sending a big hello to the world");
        diary.registerEntry("Hello Jerusalem", "We are coming to build our city");
        diary.deleteEntry(diary.findEntryBy("Hello World"));
        assertNull(diary.findEntryBy("Hello World"));
    }

    @Test
    public void signIntoDiaryTest(){
        DiaryApp dukunDiary = new DiaryApp();
        dukunDiary.createAccount("kay@gmail.com", "kayCool", 1234);
        assertTrue(dukunDiary.userExists("kay@gmail.com", "kayCool", 1234));
    }

    @Test
    public void noDuplicateEmailTest(){
        DiaryApp dukunDiary = new DiaryApp();
        dukunDiary.createAccount("kay@gmail.com", "kayCool", 1234);
        assertTrue(dukunDiary.userExists("kay@gmail.com", "kayCool", 1234));
        dukunDiary.createAccount("kay@gmail.com", "metSol", 4321);
        assertFalse(dukunDiary.userExists("kay@gmail.com", "metSol", 4321));
    }

    @Test
    public void lockAndUnlockTest(){
        DiaryApp dukunDiary = new DiaryApp();
        dukunDiary.createAccount("kay@gmail.com", "kayCool", 1234);
        Diary diary = dukunDiary.myDiary("kay@gmail.com");
        assertFalse(diary.isLocked());

        diary.lock();
        assertTrue(diary.isLocked());

        diary.unlock(1234);
        assertFalse(diary.isLocked());
    }

    @Test
    public void diaryAppCanHaveMultipleUsers(){
        DiaryApp dukunApp = new DiaryApp();
        dukunApp.createAccount("kay@gmail.com", "kayCool", 1234);
        dukunApp.createAccount("tola@gmail.com", "tolly", 4321);
        assertEquals(2, dukunApp.numberOfUsers());
    }

    @Test
    public void unlockBeforeCreatingEntry(){
        DiaryApp dukunApp = new DiaryApp();
        Diary myDiary = dukunApp.createAccount("kay@gmail.com", "kayCool", 1234);
        myDiary.lock();
        myDiary.registerEntry("Hello World", "Sending a big hello to the world");
        assertEquals(0, myDiary.numberOfEntries());
    }

    @Test
    public void unlockedBeforeFindingEntry(){
        DiaryApp dukunApp = new DiaryApp();
        Diary myDiary = dukunApp.createAccount("kay@gmail.com", "kayCool", 1234);
        myDiary.registerEntry("Hello World", "Sending a big hello to the world");
        assertEquals(1, myDiary.numberOfEntries());
        myDiary.lock();
        Entries entry = myDiary.findEntryBy("Hello World");
        assertNull(entry);
    }

}