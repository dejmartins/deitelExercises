package Practice;

public class ZeroLoadedArray {
    public static void main(String[] args) {
        int[][] myArray = new int[20][20];

        for(int[] arr : myArray){
            for(int ar : arr){
                System.out.print(ar + " ");
            }

            System.out.println();
        }
    }
}
