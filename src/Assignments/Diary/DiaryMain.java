package Assignments.Diary;


import java.util.Scanner;

public class DiaryMain {
    public static void main(String[] args) {
        DiaryApp dukunDiary = new DiaryApp();
        System.out.println("""
                WELCOME TO DUKUN DIARY-APP
                1. SIGN-UP
                2. LOGIN
                """);

        System.out.println("Go ahead, create an account");

        Scanner input = new Scanner(System.in);
        System.out.print("Email Address: ");
        String email = input.nextLine();
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        int password = input.nextInt();

        dukunDiary.createAccount(email, username, password);

        System.out.println("Successfully Registered");

        System.out.println("""
                Main Menu:
                1. 
                """);
    }
}
