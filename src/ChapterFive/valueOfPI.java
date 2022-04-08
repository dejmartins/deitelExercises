package ChapterFive;

public class valueOfPI {
    public static void main(String[] args) {
        double constant = 4;
        double pI = 4;
        int denominator = 3;

        for(int counter = 1; counter <= 200000; counter++){
            if(counter % 2 != 0)  pI = pI - constant / denominator;
            else pI = pI + constant / denominator;
            denominator += 2;

            System.out.printf("%d %10.7f%n", counter, pI);
            }
        }
    }
