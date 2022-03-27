package ChapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of department-store customers");
        int numberOfCustomers = input.nextInt();

        for(int counter = 1; counter <= numberOfCustomers; counter++) {
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Balance at the beginning of the month: ");
            int beginningOfMonthBalance = input.nextInt();
            System.out.print("Total of all items charged by customers: ");
            int totalCharge = input.nextInt();
            System.out.print("Total credits applied to customer's account: ");
            int totalCredit = input.nextInt();
            System.out.print("Allowed credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningOfMonthBalance + totalCharge - totalCredit;

            System.out.println("Your new balance is " + newBalance + " for number " + counter + " customer \n\n");

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded!\n");
            }
        }


    }
}
