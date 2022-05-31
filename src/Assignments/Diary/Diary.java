package Assignments.Diary;

import java.util.ArrayList;

public class Diary {
    private final ArrayList<Entries> userEntries = new ArrayList<>();
    public boolean isLock;
    User user;

    public Diary(User user) {
        this.user = user;
    }


    public void registerEntry(String title, String body) {
        if (!isLock){
            Entries entry = new Entries();
            entry.setTitle(title);
            entry.setBody(body);
            entry.setDate();
            userEntries.add(entry);
        }
    }

    public int numberOfEntries() {
        return userEntries.size();
    }

    public Entries findEntryBy(String title) {
        if (!isLock){
            for (Entries entry : userEntries) {
                if (title.equals(entry.getTitle())) return entry;
            }
        }
        return null;
    }

    public void deleteEntry(Entries entry) {
        userEntries.remove(entry);
    }

    public User getUser() {
        return user;
    }

    public boolean isLocked() {
        return isLock;
    }

    public void lock() {
        isLock = true;
    }

    public void unlock(int password) {
        if (user.getPassword() == password) isLock = false;
    }

}
