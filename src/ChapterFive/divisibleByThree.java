package ChapterFive;

public class divisibleByThree {
    public static void main(String[] args) {
        int total = 0;
        int counter = 3;

        while(counter <= 30){
            if(counter % 3 == 0) total += counter;
            counter++;
        }

        System.out.println(total);
    }
}
