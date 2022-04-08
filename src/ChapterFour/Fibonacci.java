package ChapterFour;

public class Fibonacci {

    public int fibonacci(){
        int sum = 0;
        int previousNumber = 1;
        int currentNumber = 2;
        int counter = 1;

        while(counter < 100){
            sum = currentNumber * previousNumber;
            System.out.printf("%d%n", sum);
            previousNumber = currentNumber;
            currentNumber = sum;
            counter++;
        }

        return 0;
    }






//    public static void main(String[] args) {
//        int sum = 0;
//        int previousNumber = 1;
//        int currentNumber = 0;
//        int counter = 1;
//
//        while(sum <= 1000000){
//            sum = currentNumber + previousNumber;
//            System.out.printf("%d%n", sum);
//            previousNumber = currentNumber;
//            currentNumber = sum;
//            counter++;
//        }
//    }
}
