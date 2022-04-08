package ChapterFive;

public class diamondPrintingProgram {
    public static void main(String[] args) {

        int count = -1;
        for (int counter = 1; counter <= 5; counter++) {

            for (int counter1 = 5; counter1 >= counter; counter1--) {
                System.out.print(' ');
            }

            count += 2;
            for (int counter2 = 1; counter2 <= count; counter2++) {
                System.out.print("*");
            }

            System.out.println();
        }

        count = 1;
        for (int counter = 1; counter <= 4; counter++) {

            for (int counter1 = 0; counter1 <= counter; counter1++) {
                System.out.print(' ');
            }

            count += 2;
            for (int counter2 = 9; counter2 >= count; counter2--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
