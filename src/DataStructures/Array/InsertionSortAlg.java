package DataStructures.Array;

public class InsertionSortAlg {
    public static void main(String[] args) {
        char [] alphabets = {'S', 'D', 'A', 'C', 'E', 'G', 'R', 'T', 'F', 'B'};

        insertionSort(alphabets);
        System.out.println(alphabets);
    }

    public static void insertionSort(char[] data){
        for (int counter1 = 1; counter1 < data.length; counter1++){
            char currentChar = data[counter1];

            int counter2 = counter1;
            for (; counter2 > 0 && data[counter2 - 1] > currentChar; counter2--){
                data[counter2] = data[counter2 - 1];
//                System.out.print(".");
            }
//            System.out.println();

            data[counter2] = currentChar;
        }
    }
}
