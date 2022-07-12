package DataStructures;

import java.util.Random;

public class PseudoRandom {
    public static void main(String[] args) {

        int a = 12;
        int b = 5;
        int n = 100;
        int cur = 92;
        int next = 92;

        for (int i = 1; i <= 5; i++){
            System.out.println(next);
            next = (a * cur + b) % n;
            cur = next;
        }

    }
}
