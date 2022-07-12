package DataStructures;

import java.util.Random;

public class RandomElimination {
    private static int[] numbers = {34, 5, 78, 5, 3, 76, 6, 7, 8, 34, 56, 34, 56};
    public static void main(String[] args) {


        int count = 0;
        while (!isEmpty(numbers)){
            randomRemoval();
            count++;
        }

        System.out.println("It looped " + count + " times");

    }

    public static void randomRemoval(){
        Random rand = new Random();
        int position = rand.nextInt(numbers.length);
        numbers[position] = 0;
    }

    public static boolean isEmpty(int[] arr){
        for (int i : arr){
            if (i != 0) return false;
        }
        return true;
    }

}
