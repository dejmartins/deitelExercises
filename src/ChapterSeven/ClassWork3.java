package ChapterSeven;

import java.security.SecureRandom;
import java.util.Random;

public class ClassWork3 {
    public static void main(String[] args) {

        generatePassword();
    }


    public static void generatePassword() {
        SecureRandom generatePass = new SecureRandom();

        char[] passwords = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c',
                'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};

        for (int counter = 1; counter < 13; counter++) {
            String password = String.valueOf(passwords[generatePass.nextInt(30 + ' ')]);
            System.out.print(password);
        }
    }
}
