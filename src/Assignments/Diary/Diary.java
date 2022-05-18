package Assignments.Diary;

import java.util.ArrayList;
import java.util.HashSet;

public class Diary{

    private User user;
    private Entries entry;
    private boolean isLock;
    private final HashSet<User> usersInfo = new HashSet<>();
    private HashSet<Entries> userEntries = new HashSet<Entries>();
    private final ArrayList<String> usersEmail = new ArrayList<>();


    public User signup(String email, String username, String password) {
        if (!checkEmail(email)) {

            user = new User();
            user.setEmail(email);
            user.setUsername(username);
            user.setPassword(password);

            usersInfo.add(user);
        }
        usersEmail.add(email);
        return user;
    }

    public boolean userExists(String emailAddress, String username, String password) {
        for (User user : usersInfo){
            if (user.getEmail() == emailAddress && user.getUsername() == username && user.getPassword() == password)
                return true;
        }
        return false;
    }

    private boolean checkEmail(String email) {
        return usersEmail.contains(email);
    }

    public boolean isLocked() {
        return isLock;
    }

    public void logIn(String username, String password) {
        if (user.getUsername() == username && user.getPassword() == password) isLock = false;
    }

    public void logOut() {
        isLock = true;
    }

    public void registerEntry(String title, String body) {
        
    }

    public int numberOfEntries() {
        return 1;
    }
}
