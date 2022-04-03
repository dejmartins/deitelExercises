package Assignments;

import java.util.stream.IntStream;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] randomNumbers = {23, 2, 7, 11, 20, 29, 3, 45, 27, 1};
    }

    public static int getMaximumNumber(int[] randomNumbers) {
        int largestNumber = 0;
        for (int elements : randomNumbers){
            if(elements > largestNumber) largestNumber = elements;
        }
        return largestNumber;
    }

    public static void getArrayElements(int[] randomNumbers) {
        for (int numbers : randomNumbers)
            System.out.printf("%d ", numbers);
    }

    public static int sumOfElements(int[] randomNumbers) {
        int total = 0;
        for (int numbers : randomNumbers)
            total += numbers;
        return total;
    }

    public static int averageOfElements(int[] randomNumbers) {
        int total = 0;
        int average = 0;
        for (int numbers : randomNumbers) {
            total += numbers;
        }
        average = total / randomNumbers.length;
        return average;
    }
}
