package ChapterFive;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number between 1 and 30");

        for(int counter = 1; counter <= 5; counter++){
            int digit = input.nextInt();

            if(digit >= 0 && digit <= 30) {
                for (int asterisksCounter = 1; asterisksCounter <= digit; asterisksCounter++) {
                    System.out.print('*');
                }
            } else break;

            System.out.println();
        }
    }
}
