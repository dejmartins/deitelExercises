package ChapterEight.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("CYLINDER VOLUME CALCULATOR");

        try{
            System.out.print("Enter Radius: ");
            int radius = sc.nextInt();
            cyl.setRadius(radius);

            System.out.print("Enter Height: ");
            int height = sc.nextInt();
            cyl.setHeight(height);

            System.out.printf("Volume is %.2f", cyl.volume());
        } catch (ArithmeticException arithmeticException){
            System.out.print(arithmeticException.getMessage());
        }


    }
}
