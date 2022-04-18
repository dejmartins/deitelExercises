package ChapterSeven;

public class BarChart {
    public static void main(String[] args) {
        int[] gradeFrequency = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        for(int counter = 0; counter < gradeFrequency.length; counter++){
            if(counter == 10){
                System.out.printf("%7d: ", 100);
            } else{
                System.out.printf("%02d - %02d: ",
                        counter * 10, counter * 10 + 9);
            }

            for(int stars = 0; stars < gradeFrequency[counter]; stars++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
