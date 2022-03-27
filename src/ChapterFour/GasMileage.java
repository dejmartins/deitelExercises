package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        System.out.println("Enter -1 to quit this application");
        int miles = 0;
        int gallons = 0;
        double totalMiles = 0;
        double totalGallons = 0;
        double totalMilesPerGallon = 0;

        Scanner in = new Scanner(System.in);
        while(miles >= 0 && gallons >= 0){
            System.out.println("Miles travelled: ");
            miles = in.nextInt();

            if(miles == -1){
                break;
            }

            System.out.println("Amount of gallons: ");
            gallons = in.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.println("The miles per gallon is: "+ milesPerGallon+ "m/g");

            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;

            totalMilesPerGallon = (double) totalMiles / totalGallons;
        }

        System.out.println("The total miles per gallon is: "+ totalMilesPerGallon+"m/g");
    }
}
