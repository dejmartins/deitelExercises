package ChapterFive;

import java.io.FilterOutputStream;

public class Interest {
    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 0.05;
        int year;

        for(year = 1; year <= 10; ++year){
            double amount = principal * Math.pow((1 + rate), year);

            System.out.printf("Year %d: %,.2f%n", year, amount);
        }


    }
}
