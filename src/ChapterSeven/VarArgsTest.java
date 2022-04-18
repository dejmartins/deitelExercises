package ChapterSeven;

public class VarArgsTest {

    public static int sum(int... numbers){
        int total = 0;
        for(int number : numbers){
            total += number;
        }

        return total;
    }


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int num4 = 20;

        System.out.printf("Sum of num1 and num2 is: %d%n", sum(num1, num2));
        System.out.printf("Sum of num1, num2 and num3 is: %d%n", sum(num1, num2, num3));
        System.out.printf("Sum of num1, num2, num3 and num4 is: %d%n", sum(num1, num2, num3, num4));



    }
}
