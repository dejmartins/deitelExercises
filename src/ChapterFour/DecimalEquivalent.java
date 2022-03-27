package ChapterFour;

import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lastNumber = 0;
        int decimalNumber = 0;
        int baseNumber = 1;

        System.out.println("Input a binary integer");
        int binaryNumber = input.nextInt();

        while(binaryNumber > 0){
            lastNumber = binaryNumber % 10;
            binaryNumber = binaryNumber / 10;

            decimalNumber += lastNumber * baseNumber;
            baseNumber += baseNumber;

        }

        System.out.printf("%d ", decimalNumber);
    }


}
