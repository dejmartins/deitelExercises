package ChapterFour;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;


        for(; studentCounter <= 10; studentCounter++){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            while(result != 1 && result != 2){
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();
            }

            if(result == 1){
                passes += 1;
            }else failures += 1;
        }

        System.out.printf("%d students passed and %d failed", passes, failures);

    }
}
