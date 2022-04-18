package ChapterSeven;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);

        System.out.println("Sorting...");
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        }

        System.out.println("\n\nFilling...");
        int[] filledArray = new int[10];
        Arrays.fill(filledArray, 5);
        for (int value : filledArray) {
            System.out.printf("%d ", value);
        }

        System.out.println("\n\nCopying...");
        int[] originals = {1, 2, 3, 4, 5, 6};
        int[] copyCat = new int[originals.length];

        System.arraycopy(originals, 0, copyCat, 0, originals.length);
        for (int value : copyCat) {
            System.out.printf("%d ", value);
        }

        System.out.println("\n\nChacking equality...");
        boolean b = Arrays.equals(originals, copyCat);
        System.out.printf("Originals %s Copycat%n", b ? "==" : "!=");

        b = Arrays.equals(filledArray, originals);
        System.out.printf("Filled Array %s Originals", b ? "==" : "!=");


        System.out.println("\n\nBinary Searching...");
        int location = Arrays.binarySearch(originals, 2);
        System.out.println("Found 3 at location " + location);
    }
}
