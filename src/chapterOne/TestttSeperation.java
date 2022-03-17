package chapterOne;

import java.sql.SQLOutput;
import java.util.Scanner;
public class TestttSeperation {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 3 digit numbers");
        int three = in.nextInt();

        int num1 = three % 10;
        int num2 = three % 100;
        int num3 = three % 1000;

        int new1 = num1/1;
        int new2 = num2/10;
        int new3 = num3/100;

        System.out.printf("%d, %d, %d%n", new3, new2, new1);
    }
}
