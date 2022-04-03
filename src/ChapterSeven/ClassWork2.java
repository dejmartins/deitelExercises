package ChapterSeven;

public class ClassWork2 {
    public static void main(String[] args) {
        arrayToPrint300Numbers();

    }

    public static void arrayToPrint300Numbers(){
        int[] numbers = new int[300];

        for(int counter = 1; counter < numbers.length; counter++){
            numbers[counter] = counter;
        }

        for(int counter = 1; counter < numbers.length; counter++){
            System.out.printf("%d ", numbers[counter]);
        }
    }
}
