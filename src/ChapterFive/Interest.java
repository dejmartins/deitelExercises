package ChapterFive;

import java.io.FilterOutputStream;

public class Interest {
    public static void main(String[] args) {

        double principal = 1000.0;
        double rate;
        int year;

        for(rate = 5; rate <= 10; rate++){
            System.out.printf("With interest rate of %.0f%%%n", rate);

            for(year = 1; year <= 10; ++year){
                double amount = principal * Math.pow((1 + (rate/100)), year);

                System.out.printf("Year %d: %,.2f%n", year, amount);
            }

            System.out.println();
        }



    }
}
