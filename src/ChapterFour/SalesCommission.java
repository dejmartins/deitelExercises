package ChapterFour;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double earnings = 0;
        double totalEarnings = 0;
        System.out.println("Enter salesperson's number of items sold");
        int numberOfItems = in.nextInt();

        for (int counter = 1; counter <= numberOfItems; counter++) {
            System.out.print("Enter item number (between 1 - 4): ");
            int itemNumber = in.nextInt();
            System.out.println();

            if (itemNumber == 1) {
                earnings = 200 + (0.09 * 239.99);
            } else if (itemNumber == 2) {
                earnings = 200 + (0.09 * 129.75);
            } else if (itemNumber == 3) {
                earnings = 200 + (0.09 * 99.95);
            } else if (itemNumber == 4) {
                earnings = 200 + (0.09 * 350.89);
            } else {
                System.out.println("Enter valid item number");
                break;
            }

            totalEarnings = totalEarnings + earnings;

        }

        System.out.println();
        System.out.printf("Salesperson's earnings: %.2f", totalEarnings);
    }
}
