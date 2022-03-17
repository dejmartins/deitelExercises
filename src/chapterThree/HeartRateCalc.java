package chapterThree;

import java.util.Scanner;
public class HeartRateCalc {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        HeartRates myHeartDetails = new HeartRates();

        System.out.println("Kindly fill in your information");
        System.out.print("Firstname: ");
        String firstName = input.nextLine();
        myHeartDetails.setFirstName(firstName);

        System.out.print("Lastname: ");
        String lastName = input.nextLine();
        myHeartDetails.setLastName(lastName);
        System.out.print("\n");

        System.out.println("Fill in your date of birth");
        System.out.print("Month: ");
        String month = input.nextLine();
        myHeartDetails.setMonth(month);

        System.out.print("Day: ");
        int day = input.nextInt();
        myHeartDetails.setDay(day);

        System.out.print("Year: ");
        int year = input.nextInt();
        myHeartDetails.setYear(year);
        System.out.print("\n");

        System.out.printf("Welcome, %s %s%n", myHeartDetails.getLastName(),
                myHeartDetails.getFirstName());
        System.out.printf("Your maximum heart rate is: %.2f%n", myHeartDetails.maximumHeartRate());
        System.out.printf("Your target heart rate is: %s%n", myHeartDetails.targetHeartRate());




    }
}
