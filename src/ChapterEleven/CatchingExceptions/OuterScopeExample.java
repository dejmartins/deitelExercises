package ChapterEleven.CatchingExceptions;

import java.util.Scanner;

public class OuterScopeExample {
    public static void main(String[] args) throws ArithmeticException{

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Divisor: ");
            int divisor = sc.nextInt();
            System.out.print("Dividend: ");
            int dividend = sc.nextInt();

            int answer = divide(divisor, dividend);
            System.out.println(answer);

        }catch (ArithmeticException e){
            System.out.println("Mess up - Div by zero error");
        }


    }

    public static int divide(int divisor, int dividend) throws IllegalArgumentException{
        try{
            if(divisor < dividend) throw new IllegalArgumentException();
            else return divisor / dividend;
        }
        catch (IllegalArgumentException ignored){
            return 0;
        }
//        catch (ArithmeticException e){
//            return 1;
//        }
    }
}
