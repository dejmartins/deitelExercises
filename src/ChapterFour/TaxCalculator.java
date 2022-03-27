package ChapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        double taxRate = 0;
        int count = 1;

        while (count <= 3){
            System.out.println("Citizen name: ");
            String name = in.nextLine();

            System.out.println("Earnings");
            int earnings = in.nextInt();
            in.nextLine();

            if(earnings > 30000)
            taxRate = 0.20 * earnings;
            else taxRate = 0.15 * earnings;

            System.out.printf("%s's tax rate is %.2f%n%n", name, taxRate);
            count++;
        }

    }
}
