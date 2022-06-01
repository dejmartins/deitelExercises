package Assignments.Diary;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class DiaryApp {
    ArrayList<Diary> diary = new ArrayList<>();
    ArrayList<User> usersInfo = new ArrayList<>();
    ArrayList<String> usersEmail = new ArrayList<>();


    public Diary createAccount(String email, String username, int password) {
        if (!checkEmail(email)){
            User user = new User();
            user.setEmail(email);
            user.setUsername(username);
            user.setPassword(password);

            Diary myDiary = new Diary(user);

            usersInfo.add(user);
            diary.add(myDiary);
        }
        usersEmail.add(email);
        return myDiary(email);
    }

    public boolean userExists(String emailAddress, String username, int password) {
        for (User user : usersInfo){
            if (user.getEmail() == emailAddress && user.getUsername() == username && user.getPassword() == password)
                return true;
        }
        return false;
    }

    private boolean checkEmail(String email) {
        return usersEmail.contains(email);
    }

    public Diary myDiary(String email) {
        for (Diary myDiary : diary){
            if (myDiary.getUser().getEmail() == email) return myDiary;
        }
        return null;
    }

    public int numberOfUsers() {
        return diary.size();
    }
}