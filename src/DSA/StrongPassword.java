package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StrongPassword {
    public static void main(String[] args) {
        String s = "2bbb#8R";
        int n = 7;

        int result = returnMinimumCharactersToMakeStrongPassword(s, n);
        System.out.println(result);
    }

    private static int returnMinimumCharactersToMakeStrongPassword(String s, int n) {
        //transform to a collection
        int result = 0;
        if (!s.matches("[A-Z]")){
            result++;
        }
        if (!s.matches("[a-z]")){
            result++;
        }
        if (!s.matches("\\d")){
            result++;
        }
        if (!s.matches("[^a-zA-Z\\d]")){
            result++;
        }
        if (n + result < 6){
            result += 6 - (n + result);
        }

        return result;
    }
}
