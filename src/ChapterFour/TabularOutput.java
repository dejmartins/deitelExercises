package ChapterFour;

public class TabularOutput {
    public static void main(String[] args) {

        int counter = 1;

        System.out.printf("%-10s%-10s%-10s%-10s%n", "N", "N2", "N3", "N4");
        for(; counter <= 5; counter++){
            for (int counter1 = 1; counter1 <= 4; counter1++){
                System.out.printf("%-9.0f ", Math.pow(counter, counter1));
            }
            System.out.println();
        }

    }
}
