package Assignments;

import java.util.Scanner;

public class MultiplicationWithoutTheMultiplicationSign {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number");
        int num1 = keyboard.nextInt();

        System.out.println("Enter number");
        int num2 = keyboard.nextInt();
int num3 = 0;
int i = 1;
        while (i <= num2) {
           // i++;
             num3 += num1;
i++;
        }
        System.out.println(num3);


    }
}
