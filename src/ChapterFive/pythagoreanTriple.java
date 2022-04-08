package ChapterFive;

public class pythagoreanTriple {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 1;

        for(int counter = 1; counter <= 500; counter++){
           c = (int) Math.pow(counter, 2);

           for(int counter1 = 1; counter1 <= 500; counter1++){
               b = (int) Math.pow(counter1, 2);
               if((a + b) == c) System.out.printf("(%d,%d,%d)%n", a, counter1, counter);

               for(int counter2 = 1; counter2 <= 500; counter2++){
                   a = (int) Math.pow(counter2, 2);
                   if((a + b) == c) System.out.printf("(%d,%d,%d)%n", counter2, counter1, counter);
               }
           }
        }
    }
}
